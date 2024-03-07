A working example of [Publishing convention plugins](https://docs.gradle.org/current/samples/sample_publishing_convention_plugins.html#publishing_convention_plugins) from the gradle samples documentation.

# Build & Run

The commands should be executed in the root folder of this repository.

1. Publish the convention-plugins

       ./gradlew :convention-plugins:publish
2. Run the convention-plugins-consumer build to see how they are used

       ./gradlew :convention-plugins-consumer:build