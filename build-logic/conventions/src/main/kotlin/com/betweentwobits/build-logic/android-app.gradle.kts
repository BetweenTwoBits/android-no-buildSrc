import com.betweentwobits.dependencies.Versions
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    base
    id("com.android.application")
    id("kotlin-android")
    id("spotless-conf")
}

val libs = the<LibrariesForLibs>()

android {
    compileSdkVersion(Versions.COMPILE_SDK)

    defaultConfig {
        applicationId("com.betweentwobits.app")
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
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
