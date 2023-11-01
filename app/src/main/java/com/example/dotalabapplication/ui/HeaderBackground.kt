package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme


@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier
        .size(AppTheme.Sizes.TopBoxSize)
        .fillMaxSize())
    {
        Image(
            painter = painter,
            contentDescription = "Dota background",
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(AppTheme.Sizes.MidleBoxSize)
                .align(alignment = Alignment.BottomCenter)
                .background(
                    color = Color(AppTheme.BgColors.primary.toArgb()),
                    AppTheme.Rounds.MidleRoundedBox
                )
        )
        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(horizontal = AppTheme.Paddings.LeftPadding)
        )
        {
            DotaLogo()
            Column(modifier = AppTheme.Paddings.AppNamePadding)
            {
                Text(
                    text = stringResource(R.string.name_app_in_store),
                    color = AppTheme.TextColors.primary,
                    fontSize = AppTheme.TextStyle.AppNameInStore.fontSize,
                    fontWeight = AppTheme.TextStyle.AppNameInStore.fontWeight
                )
            }
        }
    }
}
