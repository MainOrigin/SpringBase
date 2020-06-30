import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    war
    id("war")
    id("org.springframework.boot") version "2.4.0-SNAPSHOT"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
    kotlin("plugin.jpa") version "1.3.72"
}

group = "work.toolset.code.jvm"
version = "2020.6.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    //https://help.aliyun.com/document_detail/102512.html
    //Central
    //maven { url = uri("https://maven.aliyun.com/repository/central") }
    //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/central") }
    //JCenter
    //maven { url = uri("https://maven.aliyun.com/repository/jcenter") }
    //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/jcenter") }
    //Central和JCenter的聚合仓
    maven { url = uri("https://maven.aliyun.com/repository/public") }
    //maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public") }
    //Google
    maven { url = uri("https://maven.aliyun.com/repository/google") }
    //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google") }
    //snapshots
    maven { url = uri("https://maven.aliyun.com/repository/snapshots") }
    //maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    //spring
    maven { url = uri("https://maven.aliyun.com/repository/spring") }
    //maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/spring") }

    //maven { url = uri("https://jitpack.io") }
    //default repositories
    //mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    //if the application would be deployed via JAR package
    //please remember to comment providedRuntime spring-boot-starter-tomcat dependency
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    implementation("org.springframework.boot:spring-boot-starter-activemq")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation("org.springframework.boot:spring-boot-starter-artemis")
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-cassandra")
    implementation("org.springframework.boot:spring-boot-starter-data-cassandra-reactive")
    implementation("org.springframework.boot:spring-boot-starter-data-couchbase")
    implementation("org.springframework.boot:spring-boot-starter-data-couchbase-reactive")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-ldap")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-data-solr")
    implementation("org.springframework.boot:spring-boot-starter-freemarker")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")
    implementation("org.springframework.boot:spring-boot-starter-integration")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-mail")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
    implementation("org.springframework.boot:spring-boot-starter-quartz")
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-websocket")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.apache.kafka:kafka-streams")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.security:spring-security-messaging")
    implementation("org.springframework.security:spring-security-rsocket")
    implementation("org.springframework.session:spring-session-data-redis")
    implementation("org.springframework.session:spring-session-jdbc")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("dev.miku:r2dbc-mysql")
    runtimeOnly("io.micrometer:micrometer-registry-datadog")
    runtimeOnly("io.micrometer:micrometer-registry-influx")
    runtimeOnly("io.r2dbc:r2dbc-h2")
    runtimeOnly("io.r2dbc:r2dbc-postgresql")
    runtimeOnly("mysql:mysql-connector-java")
    runtimeOnly("org.hsqldb:hsqldb")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.springframework.amqp:spring-rabbit-test")
    testImplementation("org.springframework.batch:spring-batch-test")
    testImplementation("org.springframework.integration:spring-integration-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

//https://guides.gradle.org/writing-gradle-tasks/
//https://tuhrig.de/gradles-bootrun-and-windows-command-length-limit/
//https://stackoverflow.com/questions/38501933/createprocess-error-206-the-filename-or-extension-is-too-long-when-running-gwtc
tasks.register<Jar>("generateRuntimeDependenciesClasspathJar") {
    group = "application"
    description = ""

    dependsOn(configurations.runtimeClasspath)
    archiveAppendix.set("runtimeDependenciesClasspath")

    doFirst {
        //configurations.runtime.get().files
        println(
                "number of runtime dependencies:" +
                        configurations.runtimeClasspath.get().files.size
        )
        val filenameList: MutableList<String> = mutableListOf()
        for (currentFile in configurations.runtimeClasspath.get().files) {
            filenameList.add(
                    currentFile.toURI().toURL().toString().replaceFirst("file:/", "/")
            )
        }
        manifest {
            attributes(
                    mapOf<String, String>(
                            Pair(
                                    "Class-Path",
                                    filenameList.joinToString(" ")
                            )
                    )
            )
        }
    }
}
tasks.bootRun {
    dependsOn("generateRuntimeDependenciesClasspathJar")
    doFirst {
        classpath = files(
                "$buildDir/classes/java/main",
                "$buildDir/classes/kotlin/main",
                "$buildDir/resources/main",
                tasks.named<Jar>("generateRuntimeDependenciesClasspathJar")
                        .get().archiveFile.get().asFile
        )
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
    options.encoding = "UTF-8"
}
tasks.compileJava {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
    options.encoding = "UTF-8"
}
tasks.compileTestJava {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
    options.encoding = "UTF-8"
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
tasks.compileKotlin {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
tasks.compileTestKotlin {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
