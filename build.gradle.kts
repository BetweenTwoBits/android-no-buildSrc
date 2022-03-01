import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        //val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs") as org.gradle.accessors.dm.LibrariesForLibs
        //classpath(libs.android.gradle.plugin)
        classpath("com.android.tools.build:gradle:7.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        //classpath(libs.kotlin.gradle.plugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

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
fun String.isNonStable(): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(this)
    return isStable.not()
}

tasks.withType<DependencyUpdatesTask> {
    gradleReleaseChannel = "current"
    rejectVersionIf { candidate.version.isNonStable() && !currentVersion.isNonStable() }
}
