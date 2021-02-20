plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation("com.betweentwobits.dependencies:dependencies:SNAPSHOT")
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.spotless)
}
