rootProject.name = "android-no-buildsrc"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }
}

includeBuild("build-logic/dependencies")
includeBuild("build-logic/conventions")

include(":myLibrary")
include(":app")
