import futurist.annotations

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    annotations.forEach { annotation ->
        kotlinOptions.freeCompilerArgs += "-opt-in=$annotation"
    }
}
