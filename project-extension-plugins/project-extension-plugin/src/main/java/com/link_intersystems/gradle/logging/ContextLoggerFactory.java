package com.link_intersystems.gradle.logging;

import org.gradle.api.logging.Logger;

public interface ContextLoggerFactory {

    public Logger defaultContext();

    public Logger withContext(String context);
}