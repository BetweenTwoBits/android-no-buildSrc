plugins {
    id("com.diffplug.spotless")
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    val targetExcludes = listOf("**/generated/**")

    format("misc") {
        target("*.xml")
        trimTrailingWhitespace()
        endWithNewline()
    }
    kotlin {
        target(fileTree(".") {
            include("**/*.kt")
            exclude(targetExcludes)
        })
        ktlint().userData(mapOf("disabled_rules" to "import-ordering"))
        trimTrailingWhitespace()
        endWithNewline()
    }
    kotlinGradle {
        target("*.gradle.kts") // default target for kotlinGradle
        ktlint()
        trimTrailingWhitespace()
        endWithNewline()
    }
    java {
        target(fileTree(".") {
            include("**/*.java")
            exclude(targetExcludes)
        })
        trimTrailingWhitespace()
        endWithNewline()
        removeUnusedImports()
    }
}
