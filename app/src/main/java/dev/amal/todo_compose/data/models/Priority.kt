package dev.amal.todo_compose.data.models

import androidx.compose.ui.graphics.Color
import dev.amal.todo_compose.ui.theme.HighPriorityColor
import dev.amal.todo_compose.ui.theme.LowPriorityColor
import dev.amal.todo_compose.ui.theme.MediumPriorityColor
import dev.amal.todo_compose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}