package com.library.routing

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.mainRouter() {
    routing {
        get("/") {
            call.respond(
                HttpStatusCode.OK
            )
        }
    }
}