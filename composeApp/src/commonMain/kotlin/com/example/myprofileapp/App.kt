package com.example.myprofileapp

import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.example.myprofileapp.ui.ProfileScreen
import com.example.myprofileapp.viewmodel.ProfileViewModel
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier

@Composable
fun App() {

    val viewModel = remember { ProfileViewModel() }

    // 🔥 Ambil state dari ViewModel
    val state by viewModel.uiState.collectAsState()

    // 🔥 Gunakan state untuk theme
    val colorScheme = if (state.isDarkMode) {
        darkColorScheme()
    } else {
        lightColorScheme()
    }

    MaterialTheme(
        colorScheme = colorScheme
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProfileScreen(viewModel)
        }
    }
}