package com.library

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.library.plugins.*
import com.library.routing.mainRouter
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
        mainRouter()
    }.start(wait = true)
}
