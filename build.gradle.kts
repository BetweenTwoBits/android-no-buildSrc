buildscript {
    repositories {
        google()
        mavenCentral()
    }

    // TODO Does this file even need to exist?
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
    }
}

plugins {
    id("com.osacky.doctor").version("0.7.0")
}
