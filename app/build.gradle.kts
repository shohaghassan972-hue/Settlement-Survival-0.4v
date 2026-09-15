plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.settlementsurvival"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.settlementsurvival"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1"
    }
}
