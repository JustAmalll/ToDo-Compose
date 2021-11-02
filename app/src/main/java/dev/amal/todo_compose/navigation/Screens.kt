package dev.amal.todo_compose.navigation

import androidx.navigation.NavHostController
import dev.amal.todo_compose.utils.Action
import dev.amal.todo_compose.utils.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route ="task/$taskId")
    }

}