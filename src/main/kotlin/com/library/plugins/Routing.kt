package com.library.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import javax.security.sasl.AuthenticationException

@OptIn(KtorExperimentalLocationsAPI::class)
fun Application.configureRouting() {
    install(AutoHeadResponse)
    install(Locations) {
    }
}
