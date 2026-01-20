rootProject.name = "MultiModuleProjectKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":common")
include(":common:logger")
include(":common:mvi")
include(":common:mvi:mvi-general")
include(":common:utils")
include(":common:mvi:mvi-koin-voyager")
include(":core")
include(":core:database")
include(":core:network")
include(":core:resources")
