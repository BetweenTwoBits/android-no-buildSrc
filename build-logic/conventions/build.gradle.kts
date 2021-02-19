plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation(files(libs.javaClass.protectionDomain.codeSource.location))
    implementation("com.betweentwobits.dependencies:dependencies:SNAPSHOT")
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.spotless)
}
