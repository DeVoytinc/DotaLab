package com.example.dotalabapplication.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item{
            DotaScreenHeader()
        }
    }
}