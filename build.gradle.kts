buildscript {
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

fun isNonStable(version: String) = listOf("alpha", "beta", "rc", "cr", "m", "preview")
    .any { version.matches(".*[.\\-]$it[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE)) }

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java).configure {
    gradleReleaseChannel = "current"
    rejectVersionIf { isNonStable(candidate.version) && !isNonStable(currentVersion) }
}
