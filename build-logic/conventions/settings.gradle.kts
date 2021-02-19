dependencyResolutionManagement {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }

    versionCatalogs {
        create("libs") {
            from(files("../../gradle/dependencies.toml"))
        }
    }
}
