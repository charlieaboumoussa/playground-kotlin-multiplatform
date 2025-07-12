package com.treasure.app

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
//    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::module)
//        .start(wait = true)
}

fun Application.module() {
//    val repository = FakeTaskRepository()
//    configureSerialization(repository)
//    configureDatabases()
    routing {
        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }
    }
}

//fun Application.configureSerialization(repository: TaskRepository) {
//    install(ContentNegotiation) {
//        json()
//    }
//    routing {
//        route("/tasks") {
//            get {
//                val tasks = repository.allTasks()
//                call.respond(tasks)
//            }
//
//            get("/byName/{taskName}") {
//                val name = call.parameters["taskName"]
//                if (name == null) {
//                    call.respond(HttpStatusCode.BadRequest)
//                    return@get
//                }
//                val task = repository.taskByName(name)
//                if (task == null) {
//                    call.respond(HttpStatusCode.NotFound)
//                    return@get
//                }
//                call.respond(task)
//            }
//
//            get("/byPriority/{priority}") {
//                val priorityAsText = call.parameters["priority"]
//                if (priorityAsText == null) {
//                    call.respond(HttpStatusCode.BadRequest)
//                    return@get
//                }
//                try {
//                    val priority = Priority.valueOf(priorityAsText)
//                    val tasks = repository.tasksByPriority(priority)
//
//
//                    if (tasks.isEmpty()) {
//                        call.respond(HttpStatusCode.NotFound)
//                        return@get
//                    }
//                    call.respond(tasks)
//                } catch (ex: IllegalArgumentException) {
//                    call.respond(HttpStatusCode.BadRequest)
//                }
//            }
//
//            post {
//                try {
//                    val task = call.receive<Task>()
//                    repository.addTask(task)
//                    call.respond(HttpStatusCode.NoContent)
//                } catch (ex: IllegalStateException) {
//                    call.respond(HttpStatusCode.BadRequest)
//                } catch (ex: JsonConvertException) {
//                    call.respond(HttpStatusCode.BadRequest)
//                }
//            }
//
//            delete("/{taskName}") {
//                val name = call.parameters["taskName"]
//                if (name == null) {
//                    call.respond(HttpStatusCode.BadRequest)
//                    return@delete
//                }
//                if (repository.removeTask(name)) {
//                    call.respond(HttpStatusCode.NoContent)
//                } else {
//                    call.respond(HttpStatusCode.NotFound)
//                }
//            }
//        }
//    }
//}
//
//fun Application.configureDatabases() {
//}