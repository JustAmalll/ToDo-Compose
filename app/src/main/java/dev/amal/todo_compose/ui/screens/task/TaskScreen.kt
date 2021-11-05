package dev.amal.todo_compose.ui.screens.task

import android.content.Context
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import dev.amal.todo_compose.data.models.Priority
import dev.amal.todo_compose.data.models.ToDoTask
import dev.amal.todo_compose.ui.viewmodels.SharedViewModel
import dev.amal.todo_compose.utils.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    val context = LocalContext.current

    BackHandler { navigateToListScreen(Action.NO_ACTION) }

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = { action ->
                    if (action == Action.NO_ACTION)
                        navigateToListScreen(action)
                    else {
                        if (sharedViewModel.validateFields())
                            navigateToListScreen(action)
                        else toast(context = context)
                    }
                }
            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = {
                    sharedViewModel.updateTitle(it)
                },
                description = description,
                onDescriptionChange = {
                    sharedViewModel.description.value = it
                },
                priority = priority,
                onPrioritySelected = {
                    sharedViewModel.priority.value = it
                }
            )
        }
    )
}

fun toast(context: Context) {
    Toast.makeText(context, "Fields Empty.", Toast.LENGTH_SHORT).show()
}