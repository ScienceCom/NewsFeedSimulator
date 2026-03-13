package com.example.myprofileapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InfoItem(label: String, value: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {

        Text(
            text = "$label:",
            modifier = Modifier.width(80.dp)
        )

        Text(text = value)

    }

}
