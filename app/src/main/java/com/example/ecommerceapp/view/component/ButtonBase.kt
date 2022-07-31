package com.example.ecommerceapp.view.component

import androidx.compose.foundation.clickable
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(text:String, onClick:()->Unit){
    Button(onClick = {onClick()}) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }
}

@Composable
fun TextClickBase(text:String, onClick:()->Unit){
    Text(
        text = text,
        modifier = Modifier.clickable(
            onClick = {onClick()}
        )
    )
}