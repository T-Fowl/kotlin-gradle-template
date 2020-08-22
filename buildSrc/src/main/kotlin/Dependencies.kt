@file:Suppress("UNUSED")

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.internal.os.OperatingSystem

object Versions {
    const val kotlin = "1.4.0"
    const val protobuf = "0.8.11"
}

@Suppress("ALL")
object Libraries {

    /* Test Libraries */
    val junit = Junit
    const val mockk = "io.mockk:mockk:1.10.0"
    const val assertJ = "org.assertj:assertj-core:3.16.1"

    /* Logging */
    val log4j = Log4j

    /* Parsing */
    const val jsoup = "org.jsoup:jsoup:1.13.1"
    val jackson = Jackson

    /* Networking / IO */
    val ktor = Ktor
    const val okio =  "com.squareup.okio:okio:2.8.0"
    const val okhttp = "com.squareup.okhttp3:okhttp:4.8.1"
    val retrofit = Retrofit
    val grpc = Grpc

    /* Databases */
    const val h2 = "com.h2database:h2:1.4.200"
    const val mysql = "mysql:mysql-connector-java:8.0.21"
    const val hikariCP = "com.zaxxer:HikariCP:3.4.5"
    const val flywaydb = "org.flywaydb:flyway-core:6.5.5"
    const val exposed = "org.jetbrains.exposed:exposed:0.26.2"
    val kmongo = Kmongo
    val jasync = Jasync

    /* Dependency Injection */
    val kodein = "org.kodein.di:kodein-di:7.0.0"

    /* Maths */
    const val joml = "org.joml:joml:1.9.25"
    const val apfloat = "org.apfloat:apfloat:1.9.1"

    /* UI */
    const val tornadoFx = "no.tornado:tornadofx:1.7.20"

    /* Utility */
    const val ehcache = "org.ehcache:ehcache:3.8.1"
    val arrowkt = ArrowKt
    val apache = Apache
    val lwjgl = Lwjgl
    val asm = Asm

    /* Crypto */
    val bouncycastle = BouncyCastle
    const val jbcrypt = "org.mindrot:jbcrypt:0.4"

    /* Kotlin */
    val kotlin = Kotlin
    val kotlinx = Kotlinx

    object Kotlin {
        const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object Ktor {
        private const val version = "1.4.0"
        private const val prefix = "io.ktor:ktor"

        // ktor-server
        const val serverCore = "$prefix-server-core:$version"
        const val serverJetty = "$prefix-server-jetty:$version"
        const val serverNetty = "$prefix-server-netty:$version"
        const val serverTomcat = "$prefix-server-tomcat:$version"
        const val serverCio = "$prefix-server-cio:$version"
        const val serverServlet = "$prefix-server-servlet:$version"
        const val serverTestHost = "$prefix-server-test-host:$version"
        const val serverHostCommon = "$prefix-server-host-common:$version"

        // ktor-features
        const val auth = "$prefix-auth:$version"
        const val authJwt = "$prefix-auth-jwt:$version"
        const val authLdap = "$prefix-auth-ldap:$version"
        const val freemarker = "$prefix-freemarker:$version"
        const val velocity = "$prefix-velocity:$version"
        const val gson = "$prefix-gson:$version"
        const val jackson = "$prefix-jackson:$version"
        const val htmlBuilder = "$prefix-html-builder:$version"
        const val locations = "$prefix-locations:$version"
        const val metrics = "$prefix-metrics:$version"
        const val serverSessions = "$prefix-server-sessions:$version"
        const val websockets = "$prefix-websockets:$version"

        // ktor-client
        const val clientCore = "$prefix-client-core:$version"
        const val clientApache = "$prefix-client-apache:$version"
        const val clientCio = "$prefix-client-cio:$version"
        const val clientJetty = "$prefix-client-jetty:$version"
        const val clientOkHttp = "$prefix-client-okhttp:$version"
        const val clientAuthBasic = "$prefix-client-auth-basic:$version"
        const val clientJson = "$prefix-client-json:$version"

        // ktor-network
        const val network = "$prefix-network:$version"
        const val networkTls = "$prefix-network-tls:$version"

        // tests
        const val serverTests = "$prefix-server-tests:$version"
        const val clientMock = "$prefix-client-mock:$version"
        const val clientMockJvm = "$prefix-client-mock-jvm:$version"
    }

    object Kotlinx {

        val serialization = Serialization

        object Serialization {
            private const val version = "1.0.0-RC"
            private const val prefix = "org.jetbrains.kotlinx:kotlinx-serialization"

            const val core = "$prefix-core:$version"
            const val protobuf = "$prefix-protobuf:$version"
        }

        val coroutines = Coroutines

        object Coroutines {
            private const val version = "1.3.9"
            private const val prefix = "org.jetbrains.kotlinx:kotlinx-coroutines"

            const val core = "$prefix-core:$version"
            const val jdk8 = "$prefix-jdk8:$version"
            const val javafx = "$prefix-javafx:$version"
        }
    }

    object Retrofit {
        private const val version = "2.9.0"
        private const val prefix = "com.squareup.retrofit2"

        const val retrofit = "$prefix:retrofit:$version"
        const val jacksonConverter = "$prefix:converter-jackson:$version"
        const val gsonConverter = "$prefix:converter-gson:$version"
        const val moshiConverter = "$prefix:converter-moshi:$version"
        const val protobufConverter = "$prefix:converter-protobuf:$version"
        const val wireConverter = "$prefix:converter-wire:$version"
        const val simpleXmlConverter = "$prefix:converter-simplexml:$version"
        const val scalarsConverter = "$prefix:converter-scalars:$version"
    }

    object ArrowKt {
        private const val version = "0.10.5"
        private const val prefix = "io.arrow-kt:arrow"

        const val core = "$prefix-core:$version"
        const val syntax = "$prefix-syntax:$version"
        const val optics = "$prefix-optics:$version"
        const val fx = "$prefix-fx:$version"

        const val meta = "$prefix-meta:$version" //kapt
    }

    object Apache {
        const val commonsCompress = "org.apache.commons:commons-compress:1.20"
        const val poi = "org.apache.poi:poi-ooxml:4.1.2"
    }

    object Lwjgl {
        private const val version = "3.2.3"
        private const val prefix = "org.lwjgl:lwjgl"

        fun DependencyHandler.lwjglPlatform(): Dependency = platform("$prefix-bom:$version")

        const val lwjgl = prefix
        const val assimp = "$prefix-assimp"
        const val bgfx = "$prefix-bgfx"
        const val cuda = "$prefix-cuda"
        const val egl = "$prefix-egl"
        const val glfw = "$prefix-glfw"
        const val jawt = "$prefix-jawt"
        const val jemalloc = "$prefix-jemalloc"
        const val libdivide = "$prefix-libdivide"
        const val llvm = "$prefix-llvm"
        const val lmdb = "$prefix-lmdb"
        const val lz4 = "$prefix-lz4"
        const val meow = "$prefix-meow"
        const val nanovg = "$prefix-nanovg"
        const val nfd = "$prefix-nfd"
        const val nuklear = "$prefix-nuklear"
        const val odbc = "$prefix-odbc"
        const val openal = "$prefix-openal"
        const val opencl = "$prefix-opencl"
        const val opengl = "$prefix-opengl"
        const val opengles = "$prefix-opengles"
        const val openvr = "$prefix-openvr"
        const val opus = "$prefix-opus"
        const val ovr = "$prefix-ovr"
        const val par = "$prefix-par"
        const val remotery = "$prefix-remotery"
        const val rpmalloc = "$prefix-rpmalloc"
        const val shaderc = "$prefix-shaderc"
        const val sse = "$prefix-sse"
        const val stb = "$prefix-stb"
        const val tinyexr = "$prefix-tinyexr"
        const val tinyfd = "$prefix-tinyfd"
        const val tootle = "$prefix-tootle"
        const val vma = "$prefix-vma"
        const val vulkan = "$prefix-vulkan"
        const val xxhash = "$prefix-xxhash"
        const val yoga = "$prefix-yoga"
        const val zstd = "$prefix-zstd"

        @Suppress("INACCESSIBLE_TYPE")
        fun natives(os: OperatingSystem = OperatingSystem.current(), arch: String? = null): Natives {
            val classifier = when (os) {
                OperatingSystem.LINUX   -> System.getProperty("os.arch").let {
                    if (null != arch)
                        "natives-linux-$arch"
                    else if (it.startsWith("arm") || it.startsWith("aarch64"))
                        "natives-linux-${if (it.contains("64") || it.startsWith("armv8")) "arm64" else "arm32"}"
                    else
                        "natives-linux"
                }
                OperatingSystem.MAC_OS  -> "natives-macos"
                OperatingSystem.WINDOWS -> when {
                    null != arch                                 -> "natives-windows-$arch"
                    System.getProperty("os.arch").contains("64") -> "natives-windows"
                    else                                         -> "natives-windows-x86"
                }
                else                    -> throw Error("Unrecognized or unsupported Operating system. Please set \"lwjglNatives\" manually")
            }
            return Natives(classifier)
        }

        class Natives internal constructor(private val classifier: String) {
            val lwjgl = "$prefix:$version:$classifier"
            val assimp = "$prefix-assimp:$version:$classifier"
            val bgfx = "$prefix-bgfx:$version:$classifier"
            val glfw = "$prefix-glfw:$version:$classifier"
            val jemalloc = "$prefix-jemalloc:$version:$classifier"
            val libdivide = "$prefix-libdivide:$version:$classifier"
            val llvm = "$prefix-llvm:$version:$classifier"
            val lmdb = "$prefix-lmdb:$version:$classifier"
            val lz4 = "$prefix-lz4:$version:$classifier"
            val meow = "$prefix-meow:$version:$classifier"
            val nanovg = "$prefix-nanovg:$version:$classifier"
            val nfd = "$prefix-nfd:$version:$classifier"
            val nuklear = "$prefix-nuklear:$version:$classifier"
            val openal = "$prefix-openal:$version:$classifier"
            val opengl = "$prefix-opengl:$version:$classifier"
            val opengles = "$prefix-opengles:$version:$classifier"
            val openvr = "$prefix-openvr:$version:$classifier"
            val opus = "$prefix-opus:$version:$classifier"
            val ovr = "$prefix-ovr:$version:$classifier"
            val par = "$prefix-par:$version:$classifier"
            val remotery = "$prefix-remotery:$version:$classifier"
            val rpmalloc = "$prefix-rpmalloc:$version:$classifier"
            val shaderc = "$prefix-shaderc:$version:$classifier"
            val sse = "$prefix-sse:$version:$classifier"
            val stb = "$prefix-stb:$version:$classifier"
            val tinyexr = "$prefix-tinyexr:$version:$classifier"
            val tinyfd = "$prefix-tinyfd:$version:$classifier"
            val tootle = "$prefix-tootle:$version:$classifier"
            val vma = "$prefix-vma:$version:$classifier"
            fun hasVulkanNatives(): Boolean = classifier == "natives-macos"
            val vulkan = "$prefix-vulkan:$version:$classifier"
            val xxhash = "$prefix-xxhash:$version:$classifier"
            val yoga = "$prefix-yoga:$version:$classifier"
            val zstd = "$prefix-zstd:$version:$classifier"
        }
    }

    object Log4j {
        private const val version = "2.13.3"
        private const val prefix = "org.apache.logging.log4j:log4j"

        const val core = "$prefix-core:$version"
        const val api = "$prefix-api:$version"
        const val slf4jImpl = "$prefix-slf4j-impl:$version"
        const val slf4jImpl18 = "$prefix-slf4j18-impl:$version"
        const val jul = "$prefix-jul:$version"
        const val toSlf4j = "$prefix-to-slf4j:$version"

        const val kubernetes = "$prefix-kubernetes:$version"
        const val docker = "$prefix-docker:$version"
    }

    object Asm {
        private const val version = "8.0.1"
        private const val prefix = "org.ow2.asm:asm"

        const val asm = "$prefix:$version"
        const val commons = "$prefix-commons:$version"
        const val util = "$prefix-util:$version"
        const val tree = "$prefix-tree:$version"
        const val analysis = "$prefix-analysis:$version"
        const val test = "$prefix-test:$version"
    }

    object BouncyCastle {
        private const val version = "1.66"
        private const val prefix = "org.bouncycastle"

        const val bcprov = "$prefix:bcprov-jdk15on:$version"
        const val bcpkix = "$prefix:bcpkix-jdk15on:$version"
        const val bcmail = "$prefix:bcmail-jdk15on:$version"
        const val bcpg = "$prefix:bcpg-jdk15on:$version"
        const val bcprovExt = "$prefix:bcprov-ext-jdk15on:$version"
        const val bctls = "$prefix:bctls-jdk15on:$version"

    }

    object Jackson {
        private const val version = "2.11.12"

        const val kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:$version"
        const val jsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$version"
    }

    object Junit {
        private const val version = "5.6.2"
        private const val prefix = "org.junit.jupiter:junit-jupiter"

        const val api = "$prefix-api:$version"
        const val engine = "$prefix-engine:$version"
        const val params = "$prefix-params:$version"
        const val all = "$prefix:$version"

        /* For old projects */
        const val junit4 = "junit:junit:4.12"
    }

    object Grpc {
        private const val prefix = "io.grpc:grpc"
        private const val version = "1.26.0"

        const val netty = "$prefix-netty-shaded:$version"
        const val protobuf = "$prefix-protobuf:$version"
        const val stub = "$prefix-stub:$version"

        val plugins = Plugins

        object Plugins {
            val grpc = GrpcPlugin

            object GrpcPlugin {
                const val id = "grpc"
                const val artifact = "io.grpc:protoc-gen-grpc-java:$version"
            }

            val grpcKotlin = GrpcKotlinPlugin

            object GrpcKotlinPlugin {
                const val id = "grpckotlin"
                const val artifact = "io.rouz:grpc-kotlin-gen:0.1.4"
            }
        }
    }

    object Kmongo {
        private const val prefix = "org.litote.kmongo:kmongo"
        private const val version = "4.1.2"

        fun withJackson() = ObjectMapping()
        fun withPojoCodec() = ObjectMapping("native")
        fun withSerialization() = ObjectMapping("serialization")

        class ObjectMapping internal constructor(classifier: String? = null) {
            val sync = "$prefix${classifier?.let { "-$it" } ?: ""}:$version"
            val async = "$prefix-async${classifier?.let { "-$it" } ?: ""}:$version"
            val coroutine = "$prefix-coroutine${classifier?.let { "-$it" } ?: ""}:$version"
        }
    }

    object Jasync {
        private const val version = "1.1.3"
        const val mysql = "com.github.jasync-sql:jasync-mysql:$version"
        const val postgresql = "com.github.jasync-sql:jasync-postgresql:$version"
    }
}
