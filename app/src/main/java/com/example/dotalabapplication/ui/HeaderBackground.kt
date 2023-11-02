package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme


@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier
        .height(AppTheme.Sizes.ScreenHeaderHeight)
        .fillMaxWidth())
    {
        Image(
            painter = painter,
            contentDescription = "Dota background",
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter,
            modifier = Modifier
                .height(AppTheme.Sizes.BackGroungImageHeight)
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
                    fontWeight = AppTheme.TextStyle.AppNameInStore.fontWeight,
                    fontFamily = AppTheme.TextStyle.AppNameInStore.fontFamily,
                    lineHeight = AppTheme.TextStyle.AppNameInStore.lineHeight,
                )
                Row(
                    modifier = Modifier.width(AppTheme.Sizes.RatingStarsWidth),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                )
                {
                    repeat(5){
                        Image(
                            painter = painterResource(R.drawable.rating_star),
                            contentDescription = "rating star",
                            modifier = Modifier.size(AppTheme.Sizes.RatingStarSize)
                        )

                    }
                    Text(
                        text = stringResource(id = R.string.reviews),
                        fontFamily = AppTheme.TextStyle.NormalText.fontFamily,
                        fontSize = AppTheme.TextStyle.NormalText.fontSize,
                        fontStyle = AppTheme.TextStyle.NormalText.fontStyle,
                        color = AppTheme.TextColors.ReviewsText,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HeaderBackgroundPreview(){
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = Modifier
    )
}
