


repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation("io.ktor:ktor-client-core")
    implementation("io.ktor:ktor-client-cio")
    implementation("io.ktor:ktor-client-websockets")
    compileOnly("org.apache.logging.log4j:log4j-api:2.20.0")
    compileOnly("org.apache.logging.log4j:log4j-core:2.20.0")
    compileOnly("io.papermc.paper:paper-api:${Versions.MINECRAFT}-R0.1-SNAPSHOT")
}