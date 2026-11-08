package com.example.habisin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.habisin.data.api.ApiClient
import com.example.habisin.navigation.HabisinNavHost
import com.example.habisin.ui.theme.HabisinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ApiClient.init(applicationContext)
        setContent { HabisinTheme { HabisinNavHost() } }
    }
}
