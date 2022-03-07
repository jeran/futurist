plugins {
    `kotlin-dsl`
    `maven-publish`
    id("com.gradle.plugin-publish") version "0.20.0"
}

group = "com.jeranfox"
version = "1.0"

pluginBundle {
    website = "https://github.com/jeran/futurist"
    vcsUrl = "https://github.com/jeran/futurist.git"
    tags = listOf("android", "kotlin", "multiplatform", "opt-in")
}

gradlePlugin {
    plugins {
        get("futurist.android").apply {
            id = "com.jeranfox.futurist.android"
            displayName = "Futurist for android"
            description = "Avoid @OptIn annotations by automatically opting in to the latest android experimental apis."
            implementationClass = "Futurist_androidPlugin"
        }
        get("futurist.multiplatform").apply {
            id = "com.jeranfox.futurist.multiplatform"
            displayName = "Futurist for kotlin multiplatform"
            description = "Avoid @OptIn annotations by automatically opting in to the latest kotlin experimental apis."
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
