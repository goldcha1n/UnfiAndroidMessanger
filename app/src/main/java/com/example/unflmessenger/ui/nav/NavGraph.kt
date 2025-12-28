package com.example.unflmessenger.ui.nav

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.unflmessenger.data.AppRepository
import com.example.unflmessenger.data.SessionStore

@Composable
fun NavGraph(
    navController: NavHostController,
    repo: AppRepository,
    sessionStore: SessionStore
) {
    Text("Messenger setup in progress.")
}
