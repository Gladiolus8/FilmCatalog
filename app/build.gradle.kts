plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.filmcatalog"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.filmcatalog"
        minSdk = 27
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    kotlin {
        jvmToolchain(17)
    }

    buildFeatures {
        viewBinding = true
    }
}

val daggerVersion = "2.52"
val coreKtxVersion = "1.9.0"
val navigationKtx = "2.8.3"
val appcompatVersion = "1.7.0"
val materialVersion = "1.12.0"
val constraintLayoutVersion = "2.1.4"
val junitVersion = "4.13.2"
val junitTestVersion = "1.2.1"
val junitJupiterVersion = "5.8.2"
val espressoVersion = "3.6.1"
val glideVersion = "4.16.0"
val mockitoVersion = "5.4.0"
val legacySupportVersion = "1.0.0"


val dagger = "com.google.dagger:dagger:$daggerVersion"
val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigationKtx"
val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$navigationKtx"
val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
val material = "com.google.android.material:material:$materialVersion"
val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
val javaxInject = "javax.inject:javax.inject:1"
val junit = "junit:junit:$junitVersion"
val junitTest = "androidx.test.ext:junit:$junitTestVersion"
val junitJupiter = "org.junit.jupiter:junit-jupiter:$junitJupiterVersion"
val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
val glide = "com.github.bumptech.glide:glide:$glideVersion"
val mockitoCore = "org.mockito:mockito-core:$mockitoVersion"
val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:$mockitoVersion"
val legacySupportV4 = "androidx.legacy:legacy-support-v4:$legacySupportVersion"

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(coreKtx)
    implementation(appcompat)
    implementation(material)
    implementation(constraintLayout)
    implementation(navigationFragmentKtx)
    implementation(navigationUiKtx)
    implementation(dagger)
    implementation(legacySupportV4)
    kapt(daggerCompiler)
    implementation(javaxInject)
    testImplementation(junit)
    androidTestImplementation(junitTest)
    androidTestImplementation(espresso)
    testImplementation(junitJupiter)
    testImplementation(mockitoCore)
    testImplementation(mockitoKotlin)
    implementation (glide)
}


