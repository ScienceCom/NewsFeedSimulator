package com.example.myprofileapp.viewmodel

import com.example.myprofileapp.data.ProfileUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState

    fun updateName(newName: String) {
        _uiState.update { it.copy(name = newName) }
    }

    fun updateBio(newBio: String) {
        _uiState.update { it.copy(bio = newBio) }
    }

    fun toggleDarkMode() {
        _uiState.update { it.copy(isDarkMode = !it.isDarkMode) }
    }
}