plugins {
    kotlin("jvm") version "1.9.22"
}

group = "space.insyri"
version = "1.0-SNAPSHOT"
val ktorVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-websockets:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
}

//tasks.named<JavaExec>("run") {
//    standardInput = System.`in`
//}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}