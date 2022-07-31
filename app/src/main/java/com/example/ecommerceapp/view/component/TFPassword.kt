package com.example.ecommerceapp.view.component

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.ecommerceapp.R

@Composable
fun TFPassword(text:String, passwordValue:MutableState<String>, passwordVisible:MutableState<Boolean>){
    OutlinedTextField(
        value = passwordValue.value,
        onValueChange = { passwordValue.value = it },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisible.value = !passwordVisible.value
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.eye_password),
                    contentDescription = "",
                    tint = if (passwordVisible.value) MaterialTheme.colors.primary else Color.Gray
                )
            }
        },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )
}