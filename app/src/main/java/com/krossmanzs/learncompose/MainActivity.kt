package com.krossmanzs.learncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .border(5.dp,Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Gray)
                    .padding(5.dp)
                    .border(5.dp,Color.Cyan)
                    .padding(5.dp)
//                    .requiredWidth(300.dp) // force width
            ) {
                Text(text = "Hello", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity,"Anjay",Toast.LENGTH_SHORT).show()
                })
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
            }
        }
    }
}