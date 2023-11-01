package com.example.dotalabapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff050B18))){
        item{
            DotaScreenHeader()
        }
    }
}