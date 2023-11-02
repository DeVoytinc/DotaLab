package com.example.dotalabapplication.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.R

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = modifier
    )
}

@Preview
@Composable
fun DotaScreenHeader(){
    DotaScreenHeader(Modifier)
}