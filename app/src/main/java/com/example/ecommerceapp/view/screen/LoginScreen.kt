package com.example.ecommerceapp.view.screen

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ecommerceapp.navigation.Screen
import com.example.ecommerceapp.view.component.*

@Composable
fun LoginScreen(navController:NavController) {
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    Scaffold(backgroundColor = MaterialTheme.colors.background) {

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                TextFieldBase("Correo", emailValue)
                Spacer(modifier = Modifier.padding(10.dp))
                TFPassword("Contraseña", passwordValue , passwordVisible )
                Spacer(modifier = Modifier.padding(20.dp))
                ButtonBase("Iniciar Sesion",  onClick = {})
                Spacer(modifier = Modifier.padding(20.dp))
                TextClickBase("Crear Cuenta", onClick = {
                    Log.i("SIRVE", "Sirve")
                    navController.navigate(Screen.SignUpScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                })
            }
        }
    }
}