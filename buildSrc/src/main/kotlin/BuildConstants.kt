@file:Suppress("SpellCheckingInspection")

import org.gradle.api.JavaVersion

object AndroidConfig {
    const val compileVersion = 29
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val buildToolsSdkVersion = "29.0.2"
    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
}

object Libs {
    // Jetbrains
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutinesVersion"
    const val kotlinxSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinxSerializationVersion"
    const val ktorClient = "io.ktor:ktor-client-core:$ktorVersion"
    const val ktorClientJsonJvm = "io.ktor:ktor-client-json-jvm:$ktorVersion"
    const val ktorClientSerializer = "io.ktor:ktor-client-serialization-jvm:$ktorVersion"
    const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:$ktorVersion"

    // Google
    const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    const val coreKtx = "androidx.core:core-ktx:$coreVersion"
    const val composeTooling = "androidx.ui:ui-tooling:$composeVersion"
    const val composeLayout = "androidx.ui:ui-layout:$composeVersion"
    const val composeMaterial = "androidx.ui:ui-material:$composeVersion"
    const val composeFramework = "androidx.ui:ui-framework:$composeVersion"
    const val composeFoundation = "androidx.ui:ui-foundation:$composeVersion"
    const val material = "com.google.android.material:material:$materialVersion"

    const val okHttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"

    // Gradle Plugins
    const val androidGradlePlugin = "com.android.tools.build:gradle:$buildToolsVersion"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val kotlinSerializationGradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
}

private const val appcompatVersion = "1.2.0-alpha02"
private const val buildToolsVersion = "4.0.0-alpha09"
private const val constraintLayoutVersion = "2.0.0-beta4"
private const val composeVersion = "0.1.0-dev04"
private const val coreVersion = "1.3.0-alpha01"
private const val kotlinCoroutinesVersion = "1.3.3"
private const val kotlinVersion = "1.3.61"
private const val kotlinxSerializationVersion = "0.14.0"
private const val ktorVersion = "1.3.0"
private const val materialVersion = "1.2.0-alpha04"
private const val okhttpVersion = "4.3.1"