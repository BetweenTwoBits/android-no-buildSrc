plugins {
    id("com.android.application")
    id("kotlin-android")
    //id("spotless-conf")
}

android {
    compileSdk = libs.versions.compile.sdk.get().toInt()

    defaultConfig {
        applicationId = "com.betweentwobits.app"
        minSdk = libs.versions.min.sdk.get().toInt()
        targetSdk = libs.versions.target.sdk.get().toInt()
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
