import futurist.annotations

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    sourceSets {
        all {
            annotations.forEach { annotation ->
                languageSettings.optIn(annotation)
            }
        }
    }
}
