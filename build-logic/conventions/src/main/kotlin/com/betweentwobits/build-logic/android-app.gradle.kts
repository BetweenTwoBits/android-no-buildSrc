import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("spotless-conf")
}

val libs = the<LibrariesForLibs>()

android {
    compileSdkVersion(libs.versions.compileSdk)

    defaultConfig {
        applicationId("com.betweentwobits.app")
        minSdkVersion(libs.versions.minSdk)
        targetSdkVersion(libs.versions.targetSdk)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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
