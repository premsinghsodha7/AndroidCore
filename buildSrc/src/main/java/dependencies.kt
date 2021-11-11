package com.truckitin.buildSrc

import org.gradle.api.JavaVersion

object Versions {
    const val ktlint = "0.40.0"
}

object Config {
    const val minSdk = 23
    const val compileSdk = 31
    const val targetSdk = 31
    const val buildTools = "30.0.2"
    const val jvmTarget = "1.8"
    const val testRunner = "androidx.test.runner.AndroidJUnitRunner.8"
    val javaVersion = JavaVersion.VERSION_1_8
}

object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.3"

    const val junit = "junit:junit:4.13.2"
    const val robolectric = "org.robolectric:robolectric:4.4"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:4.0.0"
    const val mockitoInline = "org.mockito:mockito-inline:4.0.0"

    const val timber = "com.jakewharton.timber:timber:5.0.1"
    const val gson = "com.google.code.gson:gson:2.8.8"
    const val coil = "io.coil-kt:coil:1.4.0"
    const val chuckInterceptor = "com.github.chuckerteam.chucker:library:3.5.2"
    const val chuckInterceptorRelease = "com.github.chuckerteam.chucker:library-no-op:3.5.2"
    const val jwt = "com.auth0.android:jwtdecode:2.0.0"
    const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
    const val libPhoneNumber = "com.googlecode.libphonenumber:libphonenumber:8.12.35"
    const val sdp = "com.intuit.sdp:sdp-android:1.0.6"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val quadrant = "gradle.plugin.com.gaelmarhic:quadrant:1.6"
    const val expandable = "com.github.cachapa:ExpandableLayout:2.9.2"
    const val otp = "com.github.aabhasr1:OtpView:v1.1.2-ktx"

    object Retrofit {
        // Networking
        private const val version_retrofitConverter = "2.9.0"
        private const val version_retrofit = "2.9.0"
        private const val version_okhttp = "4.9.2"
        private const val version_okhttpInterceptor = "4.9.2"

        private const val retrofitConverter =
            "com.squareup.retrofit2:converter-gson:${version_retrofitConverter}"
        private const val retrofit = "com.squareup.retrofit2:retrofit:${version_retrofit}"
        private const val okhttp = "com.squareup.okhttp3:okhttp:${version_okhttp}"
        private const val okhttpInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${version_okhttpInterceptor}"
    }

    object Google {
        private const val version = "28.4.2"
        private const val crashlyticsGradleVersion = "2.7.1"
        private const val playServiceLocationVersion = "18.0.0"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val crashlyticsGradle =
            "com.google.firebase:firebase-crashlytics-gradle:$crashlyticsGradleVersion"
        const val gmsGoogleServices = "com.google.gms:google-services:4.3.10"
        const val firebaseBOM = "com.google.firebase:firebase-bom:$version"
        const val playServiceLocation = "com.google.android.gms:play-services-location:$playServiceLocationVersion"
        const val inAppMessaging = "com.google.firebase:firebase-inappmessaging-display-ktx"
        const val cloudMessaging = "com.google.firebase:firebase-messaging-ktx"
    }

    object Kotlin {
        const val version = "1.5.31"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.5.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {

        object AppCompat {
            private const val version = "1.3.1"
            const val appcompat = "androidx.appcompat:appcompat:$version"
        }

        object RecyclerView {
            private const val version = "1.2.1"
            const val recyclerview = "androidx.recyclerview:recyclerview:$version"
        }

        object MaterialDesign {
            private const val version = "1.4.0"
            const val material = "com.google.android.material:material:$version"
        }

        object ConstraintLayout {
            private const val version = "2.1.1"
            const val constraintlayout = "androidx.constraintlayout:constraintlayout:$version"
        }

        object CardView {
            private const val version = "1.0.0"
            const val cardView = "androidx.cardview:cardview:$version"
        }

        object Navigation {
            private const val version = "2.3.5"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val navigationUIKtx = "androidx.navigation:navigation-ui-ktx:$version"
            const val navigationTest = "androidx.navigation:navigation-testing:$version"
            const val navSafeArg = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
            const val hiltNavigation = "androidx.hilt:hilt-navigation-fragment:1.0.0"
        }

        object Fragment {
            private const val version = "1.3.6"
            const val fragment = "androidx.fragment:fragment:$version"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
            const val fragmentTest = "androidx.fragment:fragment-testing:$version"
        }

        object Pagination {
            private const val version = "3.0.0"
            const val paging = "androidx.paging:paging-runtime:$version"
        }

        object ViewPager2 {
            private const val version = "1.0.0"
            const val viewPager2 = "androidx.viewpager2:viewpager2:$version"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"
            const val runner = "androidx.test:runner:$version"

            object Ext {
                private const val version = "1.1.3"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
            const val truth = "com.google.truth:truth:1.1.3"
        }

        const val archCoreTesting = "androidx.arch.core:core-testing:2.1.0"

        const val coreKtx = "androidx.core:core-ktx:1.6.0"

        object Lifecycle {
            private const val version = "2.3.1"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val service = "androidx.lifecycle:lifecycle-service:$version"
            const val test = "androidx.arch.core:core-testing:2.1.0"
        }

        object Hilt {
            private const val version = "1.0.0"
            const val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
            const val workManager = "androidx.hilt:hilt-work:$version"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
        }

        object Room {
            private const val version = "2.3.0"
            const val roomRuntime = "androidx.room:room-runtime:$version"
            // Kotlin Extensions and Coroutines support for Room
            const val roomKtx = "androidx.room:room-ktx:$version"
            const val compiler = "androidx.room:room-compiler:$version"
        }

        object Work {
            private const val version = "2.6.0"
            // Kotlin + coroutines
            const val workRuntime = "androidx.work:work-runtime-ktx:$version"
        }
    }

    object Hilt {
        private const val version = "2.39.1"
        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object ProtoData {
        // preference
        const val version_protoDatastore = "1.0.0-alpha05"
        const val version_protoBuf = "3.10.0"
        const val version_prefDatastoreVersion = "1.0.0-alpha05"

        const val protoDatastoreCore = "androidx.datastore:datastore-core:$version_protoDatastore"
        const val protoBuf = "com.google.protobuf:protobuf-javalite:$version_protoBuf"
        const val preferenceDatastore =
            "androidx.datastore:datastore-preferences:$version_prefDatastoreVersion"
    }

    object AppPermissions {
        // Poko Permissions
        const val version_permissions = "2.1.4"

        // The core artifact.
        const val core = "com.markodevcic:peko:$version_permissions"
    }

    object CorporateChat {
        // TelloTalk
        const val version_corporate_chat = "v_0.1.4"

        const val corporate_chat = "com.github.tellotalksdk:tellotalksdk_corporate_chat:$version_corporate_chat"
    }

    object Compose {
        const val compose_version = "1.0.4"

        // Compose Material Design
        const val composeMaterial =  "androidx.compose.material:material:$compose_version"
        const val composeMaterialIcons =  "androidx.compose.material:material-icons-extended:$compose_version"
        // Integration with ViewModels
        const val composeVm = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-rc01"
        // Integration with activities
        const val composeActivity = "androidx.activity:activity-compose:1.3.1"
        const val composeAnimation = "androidx.compose.animation:animation:$compose_version"
        const val composeTooling = "androidx.compose.ui:ui-tooling:$compose_version"
        const val composeToolingPrev = "androidx.compose.ui:ui-tooling-preview:$compose_version"
        const val composeUI = "androidx.compose.ui:ui:$compose_version"
        const val composeNavigation = "androidx.navigation:navigation-compose:2.4.0-alpha10"
        const val composeNavigationHilt = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
        const val composeConstraintlayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02"
        const val composeSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:0.20.0"
        const val composeTest = "androidx.compose.ui:ui-test-junit4:$compose_version"

    }

}
