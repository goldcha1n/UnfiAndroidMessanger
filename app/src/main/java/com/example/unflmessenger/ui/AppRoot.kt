package com.example.unflmessenger.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.example.unflmessenger.data.AppRepository
import com.example.unflmessenger.data.SessionStore
import com.example.unflmessenger.ui.nav.NavGraph

@Composable
fun AppRoot() {
    val navController = rememberNavController()

    val sessionStore = remember { SessionStore() }
    val repo = remember { AppRepository(sessionStore) }

    NavGraph(navController = navController, repo = repo, sessionStore = sessionStore)
}
