package com.example.myprofileapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            ProfileHeader()

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Mahasiswa Teknik Informatika ITERA yang sedang belajar Pengembangan Aplikasi Mobile.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            InfoItem("Email", "falih.123140129@student.itera.ac.id")
            InfoItem("Phone", "0821-8209-1937")
            InfoItem("Location", "Bandar Lampung")

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {}
            ) {
                Text("Follow")
            }

        }

    }

}