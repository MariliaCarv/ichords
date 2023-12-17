plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ichords.daccord"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ichords.daccord"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:latest.release")
    implementation("androidx.appcompat:appcompat:latest.release")
    implementation("com.google.android.material:material:latest.release")
    implementation("androidx.constraintlayout:constraintlayout:latest.release")
    testImplementation("junit:junit:latest.release")
    androidTestImplementation("androidx.test.ext:junit:latest.release")
    androidTestImplementation("androidx.test.espresso:espresso-core:latest.release")

}
