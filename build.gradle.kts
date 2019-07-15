import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("fr.hdarritchon.sample:greeting-plugin:0.0.3-SNAPSHOT")
    }
}

apply(plugin="fr.hdarritchon.sample.hello")
apply(plugin="fr.hdarritchon.sample.goodbye")

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