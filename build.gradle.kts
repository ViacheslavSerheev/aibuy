import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import kotlin.concurrent.thread

plugins {
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.cucumber:cucumber-java:7.14.0")
    testImplementation("io.cucumber:cucumber-junit:7.14.0")
    testImplementation("io.cucumber:cucumber-spring:7.14.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")
    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    testImplementation("io.github.bonigarcia:webdrivermanager:5.6.0")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    testImplementation("org.seleniumhq.selenium:selenium-java:4.14.1")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:4.14.1")

    testRuntimeOnly("org.junit.platform:junit-platform-console")
    testRuntimeOnly("org.junit.platform:junit-platform-suite")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks {
    val consoleLauncherTest by registering(JavaExec::class) {
        dependsOn(testClasses)
        classpath = sourceSets["test"].runtimeClasspath
        mainClass.set("org.junit.platform.console.ConsoleLauncher")
        args("--include-engine", "cucumber")
        args("--details", "tree")
        args("--scan-classpath")
        systemProperty("cucumber.plugin", "pretty, summary, timeline:build/reports/timeline, html:build/reports/cucumber.html")
    }

    test {
        dependsOn(consoleLauncherTest)
        exclude("**/*")
    }
}
