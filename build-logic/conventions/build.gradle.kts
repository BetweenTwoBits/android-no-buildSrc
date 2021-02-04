import com.betweentwobits.dependencies.Libraries

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

repositories {
    mavenCentral()
    jcenter()
    google()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.betweentwobits.dependencies:dependencies:SNAPSHOT")
    implementation(Libraries.GRADLE_PLUGIN)
    implementation(Libraries.KOTLIN_GRADLE_PLUGIN)
    implementation(Libraries.SPOTLESS)
}
