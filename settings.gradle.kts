dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android-no-buildsrc"
//includeBuild("build-logic/conventions")
include(":app")
include(":myLibrary")
