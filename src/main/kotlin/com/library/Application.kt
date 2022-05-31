package com.library

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.library.routing.mainRouter
import com.library.templates.templates
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 5001, host = "localhost") {
        mainRouter()
        templates()
    }.start(wait = true)
}
