plugins {
    kotlin("jvm") version "1.9.22"
}

group = "space.insyri"
version = "1.0-SNAPSHOT"
val ktor_version: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
}

//tasks.named<JavaExec>("run") {
//    standardInput = System.`in`
//}

kotlin {
    jvmToolchain(8)
}