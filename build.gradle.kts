plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.20.0"
}

group = "com.jeranfox.futurist"
version = "1.0"

pluginBundle {
    website = "https://github.com/jeran/futurist"
    vcsUrl = "https://github.com/jeran/futurist.git"
    tags = listOf("android", "kotlin", "multiplatform", "opt-in")
}

gradlePlugin {
    plugins {
        register("futuristAndroid") {
            id = "com.jeranfox.futurist.android"
            displayName = "Futurist"
            description = "Opt in"
            implementationClass = "Futurist_androidPlugin"
        }
        register("futuristMultiplatform") {
            id = "com.jeranfox.futurist.multiplatform"
            displayName = "Futurist"
            description = "Opt in"
            implementationClass = "Futurist_multiplatformPlugin"
        }
    }
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}
