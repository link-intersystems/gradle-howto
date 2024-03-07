plugins {
    base
    id("project-extensions") version "1.0"
}


var log = loggerFactory.defaultContext()

log.error("This is an error message")
log.quiet("This is a quiet message")
log.warn("This is a warn message")
log.lifecycle("This is a lifecycle message")
log.info("This is a info message")
log.debug("This is a debug message")


greeter.sayHello("René")