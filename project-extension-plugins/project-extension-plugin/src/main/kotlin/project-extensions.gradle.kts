import com.link_intersystems.gradle.logging.ProjectContextLoggerFactory

// Java based extension
val loggerFactory = ProjectContextLoggerFactory(project)
extensions.add("loggerFactory", loggerFactory)


// kotlin based extension


abstract class Greeter {
    fun sayHello(who: String = "mate") {
        println("Hello $who")
    }
}
extensions.create<Greeter>("greeter")