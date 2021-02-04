package com.betweentwobits.dependencies

import org.gradle.api.Plugin
import org.gradle.api.Project

class Dependencies : Plugin<Project> {
    override fun apply(target: Project) {
        // Do nothing
    }
}

object Versions {
    // build
    const val KOTLIN = "1.4.21"
    const val GRADLE_PLUGIN = "4.1.2"
    const val SPOTLESS = "5.9.0"

    // sdks
    const val COMPILE_SDK = 30
    const val MIN_SDK = 21
    const val TARGET_SDK = 30

    // android x
    const val ANDROIDX_ANNOTATIONS = "1.1.0"
    const val ANDROIDX_APP_COMPAT = "1.2.0"
    const val ANDROIDX_CORE_KTX = "1.3.2"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val ANDROID_MATERIAL = "1.2.1"
}

object Libraries {
    // kotlin
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"

    // build
    const val GRADLE_PLUGIN = "com.android.tools.build:gradle:${Versions.GRADLE_PLUGIN}"
    const val SPOTLESS = "com.diffplug.spotless:spotless-plugin-gradle:${Versions.SPOTLESS}"

    // androidx
    const val ANDROIDX_ANNOTATIONS = "androidx.annotation:annotation:${Versions.ANDROIDX_ANNOTATIONS}"
    const val ANDROIDX_APP_COMPAT = "androidx.appcompat:appcompat:${Versions.ANDROIDX_APP_COMPAT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE_KTX}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROID_MATERIAL = "com.google.android.material:material:${Versions.ANDROID_MATERIAL}"
}
