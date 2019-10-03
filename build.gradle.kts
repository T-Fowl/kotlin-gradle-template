import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version Versions.kotlin
    //kotlin("kapt") version Versions.kotlin
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
}

//kapt {
//    useBuildCache = true
//}

repositories {
    jcenter()
    mavenCentral()
    maven(url = Repositories.Kotlin.kotlinx)
}

dependencies {
    compile(Libraries.kotlin.stdlibJdk8)

    testCompile(Libraries.junit)
    testCompile(Libraries.mockk)
}

