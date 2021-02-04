import com.betweentwobits.dependencies.Libraries

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
    implementation(Libraries.ANDROIDX_ANNOTATIONS)
}
