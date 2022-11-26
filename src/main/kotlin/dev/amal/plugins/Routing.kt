package dev.amal.plugins

import dev.amal.models.TickTacToeGame
import dev.amal.routes.socket
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TickTacToeGame) {
    routing {
        socket(game)
    }
}
