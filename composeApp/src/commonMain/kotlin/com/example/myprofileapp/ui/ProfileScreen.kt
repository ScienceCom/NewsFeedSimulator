package com.example.myprofileapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myprofileapp.viewmodel.ProfileViewModel

@Composable
fun ProfileScreen(viewModel: ProfileViewModel) {

    val state by viewModel.uiState.collectAsState()
    var nameInput by remember { mutableStateOf(state.name) }
    var bioInput by remember { mutableStateOf(state.bio) }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(MaterialTheme.colorScheme.background)
    ) {

        // 🔥 PROFILE VIEW
        Text(text = "Profile", style = MaterialTheme.typography.headlineMedium, color = MaterialTheme.colorScheme.onBackground)

        Spacer(modifier = Modifier.height(8.dp))

        Text("Nama: ${state.name}", color = MaterialTheme.colorScheme.onBackground)
        Text("Bio: ${state.bio}", color = MaterialTheme.colorScheme.onBackground)

        Spacer(modifier = Modifier.height(16.dp))

        // ✏️ EDIT FORM
        OutlinedTextField(
            value = nameInput,
            onValueChange = { nameInput = it },
            label = { Text("Nama") }
        )

        OutlinedTextField(
            value = bioInput,
            onValueChange = { bioInput = it },
            label = { Text("Bio") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {
            viewModel.updateName(nameInput)
            viewModel.updateBio(bioInput)
        }) {
            Text("Save")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Text("Dark Mode", color = MaterialTheme.colorScheme.onBackground)
            Switch(
                checked = state.isDarkMode,
                onCheckedChange = { viewModel.toggleDarkMode() }
            )
        }
    }
}