import org.gradle.internal.os.OperatingSystem

object Versions {
    const val kotlin = "1.3.50"
}

@Suppress("ALL")
object Libraries {

    /* Test Libraries */
    const val junit = "junit:junit:4.12"
    const val mockk = "io.mockk:mockk:1.9.3"

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

    /* Databases */
    const val h2 = "com.h2database:h2:1.4.199"
    const val mysql = "mysql:mysql-connector-java:8.0.17"
    const val hikariCP = "com.zaxxer:HikariCP:3.4.1"
    const val flywaydb = "org.flywaydb:flyway-core:6.0.4"
    const val exposed = "org.jetbrains.exposed:exposed:0.17.4"

    /* Dependency Injection */
    val kodein = Kodein

    /* Maths */
    const val joml = "org.joml:joml:1.9.18"
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
        private const val version = "1.2.5"
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

        const val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.13.0"

        val coroutines = Coroutines

        object Coroutines {
            private const val version = "1.3.2"
            private const val prefix = "org.jetbrains.kotlinx:kotlinx-coroutines"

            const val core = "$prefix-core:$version"
            const val jdk8 = "$prefix-jdk8:$version"
            const val javafx = "$prefix-javafx:$version"
        }
    }

    object Kodein {
        const val genericJvm = "org.kodein.di:kodein-di-generic-jvm:6.4.0"
    }

    object Retrofit {
        private const val version = "2.6.2"
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
        const val okhttp = "com.squareup.okhttp3:okhttp:4.2.0"
    }

    object OkIO {
        const val okio = "com.squareup.okio:okio:2.4.0"
    }

    object ArrowKt {
        //TODO: 10.0.0 on bintray
        private const val version = "0.9.0"
        private const val prefix = "io.arrow-kt:arrow"

        const val coreData = "$prefix-core-data:$version"
        const val coreExtensions = "$prefix-core-extensions:$version"
        const val syntax = "$prefix-syntax:$version"
        const val typeclasses = "$prefix-typeclasses:$version"
        const val extrasData = "$prefix-extras-data:$version"
        const val extrasExtensions = "$prefix-extras-extensions:$version"
        const val optics = "$prefix-optics:$version"
        const val meta = "$prefix-meta:$version" //kapt

        const val queryLanguage = "$prefix-query-language:$version"
        const val freeData = "$prefix-free-data:$version"
        const val freeExtensions = "$prefix-free-extensions:$version"
        const val mtl = "$prefix-mtl:$version"
        const val effectsData = "$prefix-effects-data:$version"
        const val effectsExtensions = "$prefix-effects-extensions:$version"
        const val effectsIoExtensions = "$prefix-effects-io-extensions:$version"
        const val effectsRx2Data = "$prefix-effects-rx2-data:$version"
        const val effectsRx2Extensions = "$prefix-effects-rx2-extensions:$version"
        const val effectsReactorData = "$prefix-effects-reactor-data:$version"
        const val effectsReactorExtensions = "$prefix-effects-reactor-extensions:$version"
        const val generic = "$prefix-generic:$version"
        const val recursionData = "$prefix-recursion-data:$version"
        const val recursionExtensions = "$prefix-recursion-extensions:$version"
        const val integrationEetrofitAdapter = "$prefix-integration-retrofit-adapter:$version"
    }

    object Apache {
        const val commonsCompress = "org.apache.commons:commons-compress:1.19"
        const val poi = "org.apache.poi:poi-ooxml:4.1.0"
    }

    object Lwjgl {
        private const val version = "3.2.3"
        private const val prefix = "org.lwjg:lwjgl"

        const val lwjgl = "$prefix:$version"
        const val assimp = "$prefix-assimp:$version"
        const val bgfx = "$prefix-bgfx:$version"
        const val egl = "$prefix-egl:$version"
        const val glfw = "$prefix-glfw:$version"
        const val jawt = "$prefix-jawt:$version"
        const val jemalloc = "$prefix-jemalloc:$version"
        const val lmdb = "$prefix-lmdb:$version"
        const val lz4 = "$prefix-lz4:$version"
        const val nanovg = "$prefix-nanovg:$version"
        const val nfd = "$prefix-nfd:$version"
        const val nuklear = "$prefix-nuklear:$version"
        const val odbc = "$prefix-odbc:$version"
        const val openal = "$prefix-openal:$version"
        const val opencl = "$prefix-opencl:$version"
        const val opengl = "$prefix-opengl:$version"
        const val opengles = "$prefix-opengles:$version"
        const val openvr = "$prefix-openvr:$version"
        const val ovr = "$prefix-ovr:$version"
        const val par = "$prefix-par:$version"
        const val remotery = "$prefix-remotery:$version"
        const val rpmalloc = "$prefix-rpmalloc:$version"
        const val sse = "$prefix-sse:$version"
        const val stb = "$prefix-stb:$version"
        const val tinyexr = "$prefix-tinyexr:$version"
        const val tinyfd = "$prefix-tinyfd:$version"
        const val tootle = "$prefix-tootle:$version"
        const val vma = "$prefix-vma:$version"
        const val vulkan = "$prefix-vulkan:$version"
        const val xxhash = "$prefix-xxhash:$version"
        const val yoga = "$prefix-yoga:$version"
        const val zstd = "$prefix-zstd:$version"
        const val opus = "$prefix-opus:$version"
        const val cuda = "$prefix-cuda:$version"
        const val libdivide = "$prefix-libdivide:$version"
        const val shaderrc = "$prefix-shaderrc:$version"

        @Suppress("INACCESSIBLE_TYPE")
        fun natives(os: OperatingSystem = OperatingSystem.current()): Natives = when (os) {
            OperatingSystem.LINUX   -> Natives("natives-linux")
            OperatingSystem.MAC_OS  -> Natives("natives-macos")
            OperatingSystem.WINDOWS -> Natives("natives-windows")
            else                    -> error("Unsupported operating system: $os.")
        }

        class Natives internal constructor(classifier: String) {
            val lwjgl = "$prefix:$version:$classifier"
            val assimp = "$prefix-assimp:$version:$classifier"
            val bgfx = "$prefix-bgfx:$version:$classifier"
            val glfw = "$prefix-glfw:$version:$classifier"
            val jemalloc = "$prefix-jemalloc:$version:$classifier"
            val lmdb = "$prefix-lmdb:$version:$classifier"
            val lz4 = "$prefix-lz4:$version:$classifier"
            val nanovg = "$prefix-nanovg:$version:$classifier"
            val nfd = "$prefix-nfd:$version:$classifier"
            val nuklear = "$prefix-nuklear:$version:$classifier"
            val openal = "$prefix-openal:$version:$classifier"
            val opengl = "$prefix-opengl:$version:$classifier"
            val opengles = "$prefix-opengles:$version:$classifier"
            val openvr = "$prefix-openvr:$version:$classifier"
            val ovr = "$prefix-ovr:$version:$classifier"
            val par = "$prefix-par:$version:$classifier"
            val remotery = "$prefix-remotery:$version:$classifier"
            val rpmalloc = "$prefix-rpmalloc:$version:$classifier"
            val sse = "$prefix-sse:$version:$classifier"
            val stb = "$prefix-stb:$version:$classifier"
            val tinyexr = "$prefix-tinyexr:$version:$classifier"
            val tinyfd = "$prefix-tinyfd:$version:$classifier"
            val tootle = "$prefix-tootle:$version:$classifier"
            val vma = "$prefix-vma:$version:$classifier"
            val vulkan = "$prefix-vulkan:$version:$classifier"
            val xxhash = "$prefix-xxhash:$version:$classifier"
            val yoga = "$prefix-yoga:$version:$classifier"
            val zstd = "$prefix-zstd:$version:$classifier"
            val opus = "$prefix-opus:$version:$classifier"
            val libdivide = "$prefix-libdivide:$version:$classifier"
            val shaderrc = "$prefix-shaderrc:$version:$classifier"
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
}
