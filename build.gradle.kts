buildscript {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }

    // TODO Does this file even need to exist?
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    }
}

plugins {
    // runs automatically
    id("com.osacky.doctor").version("0.7.0")

    // run with ./gradlew buildHealth
    id("com.autonomousapps.dependency-analysis").version("0.70.0")

    // run with ./gradlew dependencyUpdates
    id("com.github.ben-manes.versions").version("0.36.0")
}
