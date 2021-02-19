plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.betweentwobits.dependencies"
version = "SNAPSHOT"

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "com.betweentwobits.dependencies.Dependencies"
    }
}
