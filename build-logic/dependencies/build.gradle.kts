plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.betweentwobits.dependencies"
version = "SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "com.betweentwobits.dependencies.Dependencies"
    }
}
