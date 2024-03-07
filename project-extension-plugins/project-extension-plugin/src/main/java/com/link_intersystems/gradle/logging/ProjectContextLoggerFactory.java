package com.link_intersystems.gradle.logging;

import org.gradle.api.Project;
import org.gradle.api.logging.Logger;

public class ProjectContextLoggerFactory implements ContextLoggerFactory {

    private Project project;

    public ProjectContextLoggerFactory(Project project) {
        this.project = project;
    }

    @Override
    public Logger defaultContext() {
        String name = project.getName();
        return withContext("[" + name + "] ");
    }

    @Override
    public Logger withContext(String context) {
        Logger logger = project.getLogger();
        return ContextLoggerProxy.createContextLogger(logger, context);
    }
}
