package com.link_intersystems.gradle.logging;

import org.gradle.api.logging.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContextLoggerProxy implements InvocationHandler {

    public static Logger createContextLogger(Logger baseLogger, String context) {

        return (Logger) Proxy.newProxyInstance(ContextLoggerProxy.class.getClassLoader(), new Class<?>[]{Logger.class}, new ContextLoggerProxy(baseLogger, context));
    }

    private static final Set<String> LOG_METHOD_NAMES = new HashSet<>(Arrays.asList("error", "quiet", "warn", "lifecycle", "info", "debug"));

    private final Logger baseLogger;
    private final String context;

    private ContextLoggerProxy(Logger baseLogger, String context) {
        this.baseLogger = baseLogger;
        this.context = context;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (LOG_METHOD_NAMES.contains(method.getName())) {
            args[0] = context + args[0];
        }
        return method.invoke(baseLogger, args);
    }
}
