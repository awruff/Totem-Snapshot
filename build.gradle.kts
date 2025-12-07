plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version ("1.4.1")
}

group = "com.github.awruff"
version = "1.0.0"

unimined.minecraft {
    version("1.8.9")

    mappings {
        calamus()
        feather(28)
    }

    ornitheFabric {
        loader("0.17.3")
    }
}

repositories {
    maven("https://maven.quiltmc.org/repository/release/")
}

dependencies {
    fabricApi.osl("1.8.9", "0.16.3").forEach {
        "modImplementation"(it)
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }

    targetCompatibility = JavaVersion.VERSION_1_8
    sourceCompatibility = JavaVersion.VERSION_1_8
}