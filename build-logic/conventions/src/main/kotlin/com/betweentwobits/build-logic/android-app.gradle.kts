import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("spotless-conf")
}

val libs = the<LibrariesForLibs>()

android {
    compileSdkVersion(libs.versions.compileSdk.get().toInt())

    defaultConfig {
        applicationId("com.betweentwobits.app")
        minSdkVersion(libs.versions.minSdk.get().toInt())
        targetSdkVersion(libs.versions.targetSdk.get().toInt())
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.app.compat)
    implementation(libs.android.material)
    implementation(libs.androidx.constraint.layout)
}
