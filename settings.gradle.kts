rootProject.name = "gradle-no-buildsrc"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

includeBuild("build-logic/dependencies")
includeBuild("build-logic/conventions")

include(":myLibrary")
include(":app")
