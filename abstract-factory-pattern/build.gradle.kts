plugins {
    kotlin("jvm") version "1.7.10"
}

group = "com.quokkaman"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":abstract-factory-pattern:common"))
    implementation(project(":abstract-factory-pattern:ui-ios"))
    implementation(project(":abstract-factory-pattern:ui-web"))
    implementation(project(":abstract-factory-pattern:ui-android"))

}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}