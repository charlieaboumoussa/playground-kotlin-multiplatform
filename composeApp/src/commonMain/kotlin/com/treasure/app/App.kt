package com.treasure.app

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        Scaffold {
            NavHost(
                navController = navController,
                startDestination = Features.Preonboarding().route
            ) {
                composable(route = Features.Preonboarding().route) {
                    Text("This is the Preonboarding screen")
                }
                composable(route = Features.Authentication().route) {

                }
                composable(route = Features.Landing().route) {

                }
                composable(route = Features.Riddle().route) {

                }
                composable(route = Features.Treasure().route) {

                }
            }
        }
    }
}