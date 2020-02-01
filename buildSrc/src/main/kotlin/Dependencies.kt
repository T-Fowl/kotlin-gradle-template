import org.gradle.internal.os.OperatingSystem

object Versions {
    const val kotlin = "1.3.61"
    const val protobuf = "0.8.11"
}

@Suppress("ALL")
object Libraries {

    /* Test Libraries */
    val junit = Junit
    const val mockk = "io.mockk:mockk:1.9.3"
    const val assertJ = "org.assertj:assertj-core:3.11.1"

    /* Logging */
    val log4j = Log4j

    /* Parsing */
    const val jsoup = "org.jsoup:jsoup:1.12.1"
    val jackson = Jackson

    /* Networking / IO */
    val ktor = Ktor
    val okio = OkIO
    val okhttp = OkHttp
    val retrofit = Retrofit
    val grpc = Grpc

    /* Databases */
    const val h2 = "com.h2database:h2:1.4.199"
    const val mysql = "mysql:mysql-connector-java:8.0.17"
    const val hikariCP = "com.zaxxer:HikariCP:3.4.1"
    const val flywaydb = "org.flywaydb:flyway-core:6.0.4"
    const val exposed = "org.jetbrains.exposed:exposed:0.17.7"
    val kmongo = Kmongo
    val jasync = Jasync

    /* Dependency Injection */
    val kodein = Kodein

    /* Maths */
    const val joml = "org.joml:joml:1.9.20"
    const val apfloat = "org.apfloat:apfloat:1.9.1"

    /* UI */
    const val tornadoFx = "no.tornado:tornadofx:1.7.19"

    /* Utility */
    const val ehcache = "org.ehcache:ehcache:3.8.1"
    val arrowkt = ArrowKt
    val apache = Apache
    val lwjgl = Lwjgl
    val asm = Asm

    /* Crypto */
    val bouncycastle = BouncyCastle
    val jbcrypt = "org.mindrot:jbcrypt:0.4"

    /* Kotlin */
    val kotlin = Kotlin
    val kotlinx = Kotlinx

    object Kotlin {
        const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object Ktor {
        private const val version = "1.3.0"
        private const val prefix = "io.ktor:ktor"

        const val client = "$prefix-client:$version"
        const val clientCore = "$prefix-client-core:$version"
        const val clientCoreJvm = "$prefix-client-core-jvm:$version"
        const val clientAuthBasic = "$prefix-client-auth-basic:$version"
        const val clientWebsocket = "$prefix-client-websocket:$version"
        const val clientLoggingJvm = "$prefix-client-logging-jvm:$version"

        const val clientOkHttp = "$prefix-client-okhttp:$version"
        const val clientApache = "$prefix-client-apache:$version"
        const val clientCio = "$prefix-client-cio:$version"
        const val clientJetty = "$prefix-client-jetty:$version"

        const val clientJson = "$prefix-client-json:$version"
        const val clientJsonJvm = "$prefix-client-json-jvm:$version"

        const val jackson = "$prefix-jackson:$version"
        const val clientJackson = "$prefix-client-jackson:$version"
        const val gson = "$prefix-gson:$version"
        const val clientGson = "$prefix-client-gson:$version"

        const val velocity = "$prefix-velocity:$version"
        const val freemarker = "$prefix-freemarker:$version"

        const val features = "$prefix-features:$version"
        const val auth = "$prefix-auth:$version"
        const val authJwt = "$prefix-auth-jwt:$version"
        const val authLdap = "$prefix-auth-ldap:$version"
        const val htmlBuilder = "$prefix-html-builder:$version"
        const val locations = "$prefix-locations:$version"
        const val metrics = "$prefix-metrics:$version"
        const val websockets = "$prefix-websockets:$version"
        const val network = "$prefix-network:$version"
        const val networkTls = "$prefix-network-tls:$version"
        const val webjars = "$prefix-webjars:$version"


        const val server = "$prefix-server:$version"
        const val serverCore = "$prefix-server-core:$version"
        const val serverNetty = "$prefix-server-netty:$version"
        const val serverJetty = "$prefix-server-jetty:$version"
        const val serverCio = "$prefix-server-cio:$version"
        const val serverTomcat = "$prefix-server-tomcat:$version"
        const val serverSessions = "$prefix-server-sessions:$version"
        const val serverHostCommon = "$prefix-server-host-common:$version"

        const val serverTests = "$prefix-server-tests:$version"
        const val clientMock = "$prefix-client-mock:$version"
        const val clientMockJvm = "$prefix-client-mock-jvm:$version"
    }

    object Kotlinx {

        const val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.14.0"

        val coroutines = Coroutines

        object Coroutines {
            private const val version = "1.3.3"
            private const val prefix = "org.jetbrains.kotlinx:kotlinx-coroutines"

            const val core = "$prefix-core:$version"
            const val jdk8 = "$prefix-jdk8:$version"
            const val javafx = "$prefix-javafx:$version"
        }
    }

    object Kodein {
        const val genericJvm = "org.kodein.di:kodein-di-generic-jvm:6.5.1"
    }

    object Retrofit {
        private const val version = "2.7.1"
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

    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:4.3.0"
    }

    object OkIO {
        const val okio = "com.squareup.okio:okio:2.4.3"
    }

    object ArrowKt {
        private const val version = "0.10.4"
        private const val prefix = "io.arrow-kt:arrow"

        const val core = "$prefix-core:$version"
        const val syntax = "$prefix-syntax:$version"
        const val optics = "$prefix-optics:$version"
        const val fx = "$prefix-fx:$version"
        
        const val meta = "$prefix-meta:$version" //kapt
    }

    object Apache {
        const val commonsCompress = "org.apache.commons:commons-compress:1.19"
        const val poi = "org.apache.poi:poi-ooxml:4.1.0"
    }

    object Lwjgl {
        private const val version = "3.2.3"
        private const val prefix = "org.lwjgl:lwjgl"

        fun DependencyHandler.lwjglPlatform() = platform("$prefix-bom:$version")

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
            val lwjgl = "$prefix:$classifier"
            val assimp = "$prefix-assimp:$classifier"
            val bgfx = "$prefix-bgfx:$classifier"
            val glfw = "$prefix-glfw:$classifier"
            val jemalloc = "$prefix-jemalloc:$classifier"
            val libdivide = "$prefix-libdivide:$classifier"
            val llvm = "$prefix-llvm:$classifier"
            val lmdb = "$prefix-lmdb:$classifier"
            val lz4 = "$prefix-lz4:$classifier"
            val meow = "$prefix-meow:$classifier"
            val nanovg = "$prefix-nanovg:$classifier"
            val nfd = "$prefix-nfd:$classifier"
            val nuklear = "$prefix-nuklear:$classifier"
            val openal = "$prefix-openal:$classifier"
            val opengl = "$prefix-opengl:$classifier"
            val opengles = "$prefix-opengles:$classifier"
            val openvr = "$prefix-openvr:$classifier"
            val opus = "$prefix-opus:$classifier"
            val ovr = "$prefix-ovr:$classifier"
            val par = "$prefix-par:$classifier"
            val remotery = "$prefix-remotery:$classifier"
            val rpmalloc = "$prefix-rpmalloc:$classifier"
            val shaderc = "$prefix-shaderc:$classifier"
            val sse = "$prefix-sse:$classifier"
            val stb = "$prefix-stb:$classifier"
            val tinyexr = "$prefix-tinyexr:$classifier"
            val tinyfd = "$prefix-tinyfd:$classifier"
            val tootle = "$prefix-tootle:$classifier"
            val vma = "$prefix-vma:$classifier"
            fun hasVulkanNatives(): Boolean = classifier == "natives-macos"
            val vulkan = "$prefix-vulkan:$classifier"
            val xxhash = "$prefix-xxhash:$classifier"
            val yoga = "$prefix-yoga:$classifier"
            val zstd = "$prefix-zstd:$classifier"
        }
    }

    object Log4j {
        private const val version = "2.12.1"
        private const val prefix = "org.apache.logging.log4j:log4j"

        const val core = "$prefix-core:$version"
        const val api = "$prefix-api:$version"
        const val slf4jImpl = "$prefix-slf4j-impl:$version"
        const val slf4jImpl18 = "$prefix-slf4j18-impl:$version"
        const val jul = "$prefix-jul:$version"
        const val toSlf4j = "$prefix-to-slf4j:$version"
    }

    object Asm {
        private const val version = "7.2"
        private const val prefix = "org.ow2.asm:asm"

        const val asm = "$prefix:$version"
        const val commons = "$prefix-commons:$version"
        const val util = "$prefix-util:$version"
        const val tree = "$prefix-tree:$version"
        const val analysis = "$prefix-analysis:$version"
        const val test = "$prefix-test:$version"
    }

    object BouncyCastle {
        private const val version = "1.63"
        private const val prefix = "org.bouncycastle"

        const val bcprov = "$prefix:bcprov-jdk15on:$version"
        const val bcpkix = "$prefix:bcpkix-jdk15on:$version"
        const val bcmail = "$prefix:bcmail-jdk15on:$version"
        const val bcpg = "$prefix:bcpg-jdk15on:$version"
        const val bcprovExt = "$prefix:bcprov-ext-jdk15on:$version"
        const val bctls = "$prefix:bctls-jdk15on:$version"

    }

    object Jackson {
        private const val version = "2.10.0"
        private const val prefix = "com.fasterxml.jackson.module:jackson-module"

        const val kotlin = "$prefix-kotlin:$version"
    }
    
    object Junit {
        private const val version = "5.5.2"
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
        
        val netty = "$prefix-netty-shaded:$version"
        val protobuf = "$prefix-protobuf:$version"
        val stub = "$prefix-stub:$version"
        
        val plugins = Plugins
        
        object Plugins {
            val grpc = GrpcPlugin
            object GrpcPlugin {
                val id = "grpc"
                val artifact = "io.grpc:protoc-gen-grpc-java:$version"
            }
            
            val grpcKotlin = GrpcKotlinPlugin
            object GrpcKotlinPlugin {
                val id = "grpckotlin"
                val artifact = "io.rouz:grpc-kotlin-gen:0.1.4"
            }
        }
    }
    
    object Kmongo {
        private const val prefix = "org.litote.kmongo:kmongo"
        private const val version = "3.11.2"
        
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
        const val mysql = "com.github.jasync-sql:jasync-mysql:1.0.13"
        const val postgresql = "com.github.jasync-sql:jasync-postgresql:1.0.13"
    }
}
