// These plugins are all related to dependencies and build health
plugins {
    // runs automatically
    alias(libs.plugins.doctor)

    // run with ./gradlew buildHealth
    // uncommenting this causes `Unable to load class 'org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension'.`
    // issue filed here: https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/368
//    alias(libs.plugins.analyser)

    // run with ./gradlew dependencyUpdates
    alias(libs.plugins.versions)
}

// Configure `com.github.ben-manes.versions` to only show final releases
fun isNonStable(version: String) = listOf("alpha", "beta", "rc", "cr", "m", "preview")
    .any { version.matches(".*[.\\-]$it[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE)) }

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java).configure {
    gradleReleaseChannel = "current"
    rejectVersionIf { isNonStable(candidate.version) && !isNonStable(currentVersion) }
}
