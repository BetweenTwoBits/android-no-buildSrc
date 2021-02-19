plugins {
    id("android-app")
}

android {
    defaultConfig {
        applicationId = "com.betweentwobits.app"
    }
}

dependencies {
    implementation(project(":myLibrary"))
    implementation(libs.androidx.annotations)
}
