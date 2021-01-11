package com.betweentwobits.dependencies

import org.gradle.api.Plugin
import org.gradle.api.Project

class Dependencies : Plugin<Project> {
    override fun apply(target: Project) {
        // Do nothing
    }

    companion object {
        const val KOTLIN = "1.4.21"
        const val GRADLE_PLUGIN = "4.1.2"
        const val SPOTLESS = "5.9.0"

        // Sdks
        const val COMPILE_SDK = 30
        const val MIN_SDK = 21
        const val TARGET_SDK = 30

        const val ANDROIDX_APP_COMPAT = "1.2.0"
        const val ANDROIDX_CORE_KTX = "1.3.2"
        const val ANDROID_MATERIAL = "1.2.1"
        const val CONSTRAINT_LAYOUT = "2.0.4"
    }
}
