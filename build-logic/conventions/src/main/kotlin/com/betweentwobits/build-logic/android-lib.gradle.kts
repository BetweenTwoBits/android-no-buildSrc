import com.betweentwobits.dependencies.Libraries
import com.betweentwobits.dependencies.Versions

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("spotless-conf")
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)

    defaultConfig {
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
    implementation(Libraries.KOTLIN_STDLIB)
    implementation(Libraries.ANDROIDX_CORE_KTX)
    implementation(Libraries.ANDROIDX_APP_COMPAT)
}
