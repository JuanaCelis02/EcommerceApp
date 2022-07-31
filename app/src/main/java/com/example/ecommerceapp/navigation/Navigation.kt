package com.example.ecommerceapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerceapp.view.screen.HomeScreen
import com.example.ecommerceapp.view.screen.LoginScreen
import com.example.ecommerceapp.view.screen.SignUpScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  Screen.LoginScreen.route){
        composable(Screen.LoginScreen.route){
            LoginScreen(navController)
        }
        composable(Screen.SignUpScreen.route){
            SignUpScreen(navController)
        }
        composable(Screen.HomeScreen.route){
            HomeScreen(navController)
        }
    }
}