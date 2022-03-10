package dev.amal.todo_compose.utils

enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}

fun String?.toAction(): Action =
    if (this.isNullOrEmpty()) Action.NO_ACTION else Action.valueOf(this)
