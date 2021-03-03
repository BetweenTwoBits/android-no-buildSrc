dependencyResolutionManagement {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }

    versionCatalogs {
        create("libs") {
            from(files("../../gradle/libs.versions.toml"))
        }
    }
}
