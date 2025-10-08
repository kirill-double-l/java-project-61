plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.53.0"
    id("application")
    id("org.sonarqube") version "6.3.1.5724"
    id("checkstyle")
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

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "kirill-double-l_java-project-61")
        property("sonar.organization", "kirill-double-l")
    }
}

checkstyle {
    toolVersion = "10.17.0" // актуальная версия Checkstyle
    configFile = file("config/checkstyle/checkstyle.xml")
}
