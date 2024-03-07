pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            // replace the path with the actual path to the repository
            url = uri(layout.rootDirectory.file("../project-extension-plugin/build/repo"))
        }
    }
}