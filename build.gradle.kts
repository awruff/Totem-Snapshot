plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version ("1.4.1")
}

group = "com.github.awruff"
version = "1.0.0+15w33c"

unimined.minecraft {
    version("15w33c")

    mappings {
        calamus()
        feather(28)
    }

    ornitheFabric {
        loader("0.17.3")
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }

    targetCompatibility = JavaVersion.VERSION_1_8
    sourceCompatibility = JavaVersion.VERSION_1_8
}