plugins {
    id("java")
}

group = "com.quokkaman"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":abstract-factory-pattern:common"))
}
