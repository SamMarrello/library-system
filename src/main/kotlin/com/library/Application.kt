package com.library

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.library.routing.mainRouter
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 7000, host = "localhost") {
        mainRouter()
    }.start(wait = true)
}
