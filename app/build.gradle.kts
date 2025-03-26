plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // Add this if you're using ViewBinding
    id("kotlin-parcelize") // Optional for Parcelable support
}

android {
    namespace = "com.imethsuka.gifto"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.imethsuka.gifto"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true // For vector drawable support
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        // Optional debug configuration
//        debug {
//            applicationIdSuffix = ".debug"
//            debuggable = true
//        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        // Enable core library desugaring (for Java 8+ APIs)
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    // Enable ViewBinding or DataBinding
    buildFeatures {
        viewBinding = true
        // compose = true // Uncomment if using Jetpack Compose
    }
}

dependencies {
    // Core dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // UI Components
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.cardview:cardview:1.0.0")

    // Emoji compatibility
    implementation(libs.androidx.emoji2.views)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Core library desugaring (for Java 8+ APIs)
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")

    // Optional useful dependencies:
    // implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    // implementation("androidx.fragment:fragment-ktx:1.6.1")
}