plugins {
    kotlin("multiplatform") version "1.9.23"
    id("org.jetbrains.compose") version "1.6.1"
    id("net.kodein.cup") version "1.0.0-Beta-01"
}

cup {
    targetDesktop()

    // TODO: If you comment this (you don't want to export your presentation as a web page),
    //  you must remove the .github/workflows/pages.yml file as well.
    targetWeb()
}

kotlin {
    sourceSets.commonMain {
        dependencies {
            // Includes Source Code highlighting & animations.
            implementation(cup.sourceCode)

            // Secondary window with preview & speaker notes.
            implementation(cup.plugin.speakerWindow)

            // Allows to draw over the presentation on the main window.
            // This tool is also part of the Speaker Mode window.
            implementation(cup.plugin.laser)

            implementation(compose.material3)
            implementation("org.kodein.emoji:emoji-compose-m3:1.3.0")
        }
    }
}
