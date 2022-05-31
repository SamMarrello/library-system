package com.library

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.library.routing.mainRouter
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.

fun main() {
    embeddedServer(Netty, port = 5001, host = "localhost") {
        mainRouter()
        install(logging)
    }.start(wait = true)
}
