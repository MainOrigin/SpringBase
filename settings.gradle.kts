pluginManagement {
    repositories {
        //gradle-plugin
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin") }
        //spring-plugin
        maven { url = uri("https://maven.aliyun.com/repository/spring-plugin") }
        //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/spring-plugin") }
        //default
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.springframework.boot") {
                useModule("org.springframework.boot:spring-boot-gradle-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "spring"
