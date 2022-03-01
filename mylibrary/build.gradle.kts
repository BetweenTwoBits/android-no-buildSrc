plugins {
    id("com.android.library")
    id("kotlin-android")
    //id("spotless-conf")
}

android {
    compileSdkVersion = 31

    defaultConfig {
        minSdkVersion = 21
        targetSdkVersion = 31
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.app.compat)
}
