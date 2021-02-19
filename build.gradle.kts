buildscript {
    // TODO Does this file even need to exist?
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    }
}

plugins {
    // runs automatically
    id("com.osacky.doctor")

    // run with ./gradlew buildHealth
    id("com.autonomousapps.dependency-analysis")

    // run with ./gradlew dependencyUpdates
    id("com.github.ben-manes.versions")
}

fun isNonStable(version: String) = listOf("alpha", "beta", "rc", "cr", "m", "preview")
    .any { version.matches(".*[.\\-]$it[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE)) }

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java).configure {
    gradleReleaseChannel = "current"
    rejectVersionIf { isNonStable(candidate.version) && !isNonStable(currentVersion) }
}
