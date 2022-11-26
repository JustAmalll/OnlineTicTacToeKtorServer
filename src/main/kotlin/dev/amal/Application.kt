package dev.amal

import dev.amal.models.TickTacToeGame
import io.ktor.server.application.*
import dev.amal.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(TickTacToeGame())
}
