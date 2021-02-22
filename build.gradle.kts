plugins {
    // runs automatically
    id("com.osacky.doctor")

    // run with ./gradlew buildHealth
    // uncommenting this causes `Unable to load class 'org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension'.`
//    id("com.autonomousapps.dependency-analysis")

    // run with ./gradlew dependencyUpdates
    id("com.github.ben-manes.versions")
}

fun isNonStable(version: String) = listOf("alpha", "beta", "rc", "cr", "m", "preview")
    .any { version.matches(".*[.\\-]$it[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE)) }

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java).configure {
    gradleReleaseChannel = "current"
    rejectVersionIf { isNonStable(candidate.version) && !isNonStable(currentVersion) }
}
