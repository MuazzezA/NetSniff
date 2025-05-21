package com.muazzeza.netsniff

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.muazzeza.netsniff.ui.theme.NetSniffTheme
import com.muazzeza.netsniff.views.ScanScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NetSniffTheme {
                ScanScreen()
            }
        }
    }
}



