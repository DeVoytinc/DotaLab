package com.example.dotalabapplication.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Rounds
import com.example.dotalabapplication.ui.theme.Sizes

@Composable
fun DotaLogo(){
    Box(
        modifier = Modifier
            .size(Sizes.LogoSize)
            .background(
                Color.Black,
                RoundedCornerShape(Rounds.RoundMain)
            )
            .border(
                Sizes.BorderLogo,
                Color(BgColors.border.toArgb()),
                RoundedCornerShape(Rounds.RoundMain)
            )
            .shadow(30.dp, shape = RectangleShape, spotColor = Color.Black   )
    )
    {
        Image(
            painter = painterResource(R.drawable.dota_logo),
            contentDescription = "Dota logo",
            modifier = Modifier
                .fillMaxSize()
                .padding(Paddings.LogoPadding)

        )
    }

}

@Preview
@Composable
fun DotaLogoPreview(){
    DotaLogo()
}