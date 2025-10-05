plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.53.0"
    id("application")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    // Указываем главный класс
    mainClass.set("hexlet.code.App")
}

tasks.test {
    useJUnitPlatform()
}