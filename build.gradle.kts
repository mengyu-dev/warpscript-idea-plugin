plugins {
    id("org.jetbrains.intellij") version "0.6.3"
    kotlin("jvm") version "1.4.10"
}

group = "dev.mengyu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.+")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2020.2.2"
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}

sourceSets["main"].java.srcDirs("src/main/gen")