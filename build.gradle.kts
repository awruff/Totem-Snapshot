plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version ("1.4.1")
}

group = "com.github.awruff"
version = "1.0-SNAPSHOT"

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

repositories {
    maven("https://maven.quiltmc.org/repository/release/")
}

dependencies {
    fabricApi.osl("15w33c", "0.16.3").forEach {
        "modImplementation"(it)
    }
}