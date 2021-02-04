import com.betweentwobits.dependencies.Dependencies

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("spotless-conf")
}

repositories {
    mavenCentral()
    jcenter()
    google()
}

android {
    compileSdkVersion(Dependencies.COMPILE_SDK)

    defaultConfig {
        applicationId("com.betweentwobits.app")
        minSdkVersion(Dependencies.MIN_SDK)
        targetSdkVersion(Dependencies.TARGET_SDK)
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Dependencies.KOTLIN}")
    implementation("androidx.core:core-ktx:${Dependencies.ANDROIDX_CORE_KTX}")
    implementation("androidx.appcompat:appcompat:${Dependencies.ANDROIDX_APP_COMPAT}")
    implementation("com.google.android.material:material:${Dependencies.ANDROID_MATERIAL}")
    implementation("androidx.constraintlayout:constraintlayout:${Dependencies.CONSTRAINT_LAYOUT}")
}
