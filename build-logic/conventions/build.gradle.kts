import com.betweentwobits.dependencies.Dependencies

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

repositories {
    jcenter()
    google()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.betweentwobits.dependencies:dependencies:SNAPSHOT")
    implementation("com.android.tools.build:gradle:${Dependencies.GRADLE_PLUGIN}")
    implementation(kotlin("gradle-plugin", Dependencies.KOTLIN))
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${Dependencies.SPOTLESS}")
}
