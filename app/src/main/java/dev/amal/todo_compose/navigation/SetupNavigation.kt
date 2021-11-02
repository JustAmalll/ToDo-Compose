package dev.amal.todo_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dev.amal.todo_compose.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
) {

    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {

    }

}
