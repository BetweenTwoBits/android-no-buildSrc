plugins {
    id("com.android.application")
    id("kotlin-android")
    //id("spotless-conf")
}

android {
    compileSdkVersion = 31

    defaultConfig {
        applicationId = "com.betweentwobits.app"
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
    implementation(project(":myLibrary"))
    implementation(libs.android.material)
    implementation(libs.androidx.annotations)
    implementation(libs.androidx.app.compat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraint.layout)
    implementation(libs.kotlin.stdlib)
}
