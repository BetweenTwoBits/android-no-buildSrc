import com.betweentwobits.dependencies.Dependencies

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
    implementation("androidx.annotation:annotation:${Dependencies.ANDROIDX_ANNOTATIONS}")
}
