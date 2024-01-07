# Futurist
Include this plugin to `@OptIn` to everything.

## Usage

### Android

```kotlin
plugins {
    id("dev.jeran.futurist.android").version("1.6.0")
}
```

### Kotlin Multiplatform

```kotlin
plugins {
    id("dev.jeran.futurist.multiplatform").version("1.6.0")
}
```

## Warning

Unfortunately this will produce a warning in your build output for every unrecognized annotation.

## Contributing

See [Annotations.kt](https://github.com/jeran/futurist/blob/main/src/main/kotlin/futurist/Annotations.kt) for a list of currently supported annotations.

If you need an annotation that isn't on this list, feel free to open a pull request.
