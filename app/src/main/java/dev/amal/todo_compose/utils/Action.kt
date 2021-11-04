package dev.amal.todo_compose.utils

enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}

fun String?.toAction(): Action = when {
    this == "ADD" -> {
        Action.ADD
    }
    this == "UPDATE" -> {
        Action.UPDATE
    }
    this == "DELETE" -> {
        Action.DELETE
    }
    this == "DELETE_ALL" -> {
        Action.DELETE_ALL
    }
    this == "UNDO" -> {
        Action.UNDO
    }
    else -> {
        Action.NO_ACTION
    }
}