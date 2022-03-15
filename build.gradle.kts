import com.lovelysystems.gradle.isProductionVersion

plugins {
    base
    id("com.lovelysystems.gradle") version ("1.6.2")
}

lovely {
    gitProject()
    dockerProject("natterstefan/graphql-voyager")
}

with(lovely.dockerFiles) {
    from(".") {
        include(
            "package.json",
            "src/**",
            "yarn.lock"
        )
    }
    from("docker/Dockerfile")
}
