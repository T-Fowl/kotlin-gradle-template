import org.gradle.internal.os.OperatingSystem

object Versions {
    const val kotlin = "1.3.30"
}

object Libraries {
    const val junit = "junit:junit:4.12"
    const val mockk = "io.mockk:mockk:1.9.3"
    const val log4jSlf4jImpl = "org.apache.logging.log4j:log4j-slf4j-impl:2.11.2"
    const val jsoup = "org.jsoup:jsoup:1.11.3"
    const val h2 = "com.h2database:h2:1.4.197"
    const val exposed = "org.jetbrains.exposed:exposed:0.13.5"
    const val guice = "com.google.inject:guice:4.2.2"
    const val tornadoFx = "no.tornado:tornadofx:1.7.17"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"
    const val apfloat = "org.apfloat:apfloat:1.8.3"
    const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8"
    const val joml = "org.joml:joml:1.9.12"

    object Kotlin {
        const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object Ktor {
        private const val version = "1.1.5"
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

        const val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.10.0"

        object Coroutines {
            private const val version = "1.2.1"
            private const val prefix = "org.jetbrains.kotlinx:kotlinx-coroutines"

            const val core = "$prefix-core:$version"
            const val jdk8 = "$prefix-jdk8:$version"
            const val javafx = "$prefix-javafx:$version"
        }
    }

    object Kodein {
        const val genericJvm = "org.kodein.di:kodein-di-generic-jvm:6.2.0"
    }

    object Retrofit {
        private const val version = "2.5.0"
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
        const val okhttp = "com.squareup.okhttp3:okhttp:3.14.0"
    }

    object Okio {
        const val okio = "com.squareup.okio:okio:2.2.2"
    }

    object ArrowKt {
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

    object ApacheCommons {
        const val compress = "org.apache.commons:commons-compress:1.18"
    }

    object Lwjgl {
        private const val version = "3.2.2"
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

        @Suppress("INACCESSIBLE_TYPE")
        fun Natives(os: OperatingSystem = OperatingSystem.current()): Natives = when (os) {
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
        }
    }
}