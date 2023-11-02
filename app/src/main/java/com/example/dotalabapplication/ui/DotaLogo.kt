package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme

@Composable
fun DotaLogo(){
    Box(
        modifier = Modifier
            .size(AppTheme.Sizes.LogoSize)
            .background(
                Color.Black,
                RoundedCornerShape(AppTheme.Rounds.RoundMain)
            )
            .border(
                AppTheme.Sizes.BorderLogo,
                Color(AppTheme.BgColors.border.toArgb()),
                RoundedCornerShape(AppTheme.Rounds.RoundMain)
            )
    )
    {
        Image(
            painter = painterResource(R.drawable.dota_logo),
            contentDescription = "Dota logo",
            modifier = Modifier
                .fillMaxSize()
                .padding(AppTheme.Paddings.LogoPadding)

        )
    }
}

@Preview
@Composable
fun DotaLogoPreview(){
    DotaLogo()
}