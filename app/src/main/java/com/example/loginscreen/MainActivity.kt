package com.example.loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginscreen.ui.theme.LoginScreenTheme

class MainActivity : ComponentActivity() {



























    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreenTheme {
                LoginScreen()
            }
        }
    }
}

