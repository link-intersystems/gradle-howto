plugins {
    `kotlin-dsl`
    id("maven-publish") // if you never publish the plugin, you may remove this (but it also does not hurt)
}

group = "com.myorg.conventions"
version = "1.0"

publishing {
    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            url = uri(layout.buildDirectory.dir("repo"))
        }
    }
}

tasks.publish {
    dependsOn("check")
}

// Things that are not documented
// ==============================
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
}