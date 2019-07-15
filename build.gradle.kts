import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("fr.hdarritchon.utils.kesve:kesve-gradle-plugin:0.0.1-SNAPSHOT")
    }
}

apply(plugin="fr.hdarritchon.utils.kesve.kesve-gradle-plugin")

plugins {
    `maven-publish`
    `java-gradle-plugin`
    kotlin("jvm") version "1.3.31"
}

group = "fr.hervedarritchon.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("fr.hervedarritchon.utils:kesve-library:1.0-SNAPSHOT")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}