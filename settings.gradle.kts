rootProject.name = "android-no-buildsrc"

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
