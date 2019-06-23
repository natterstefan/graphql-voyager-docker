import com.lovelysystems.gradle.isProductionVersion

plugins {
    base
    id("com.lovelysystems.gradle") version ("1.1.0")
}

lovely {
    gitProject()
    dockerProject("graphql-voyager")
}

with(lovely.dockerFiles) {
    from(".") {
        include(
            "package.json",
            "package-lock.json",
            "src/**"
        )
    }
    from("docker/Dockerfile")
}
