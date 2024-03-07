This project shows how to add an extension to gradle [`Project`](https://docs.gradle.org/current/javadoc/org/gradle/api/Project.html).
See [Add a custom function to a Gradle Project in a convention plugin](https://stackoverflow.com/questions/78091635/add-a-custom-function-to-a-gradle-project-in-a-convention-plugin)

# Build & Run

The commands should be executed in the root folder of this repository.

1. Publish the convention-plugins

       ./gradlew :project-extension-plugin:publish
2. Run the convention-plugins-consumer build to see how they are used

       ./gradlew :project-extension-plugin-consumer:build