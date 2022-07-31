package com.example.ecommerceapp.view.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ecommerceapp.navigation.Screen
import com.example.ecommerceapp.view.component.*

@Composable
fun SignUpScreen(navController: NavController) {
    val nameValue = remember { mutableStateOf("") }
    val emailValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordConfirm = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val passwordConfirmVisible = remember { mutableStateOf(false) }

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
                TextFieldBase("Nombre",nameValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Correo",emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Telefono", phoneValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TFPassword("Contraseña", passwordValue ,  passwordVisible )
                Spacer(modifier = Modifier.padding(5.dp))
                TFPassword("Confirmar contraseña", passwordConfirm , passwordConfirmVisible )
                Spacer(modifier = Modifier.padding(10.dp))
                ButtonBase("Registrarse",  onClick = {})
                Spacer(modifier = Modifier.padding(10.dp))
                TextClickBase("Iniciar Sesion", onClick = {
                    navController.navigate(Screen.LoginScreen.route){
                        popUpTo(Screen.SignUpScreen.route){
                            inclusive = true
                        }
                    }
                })
            }
        }
    }
}