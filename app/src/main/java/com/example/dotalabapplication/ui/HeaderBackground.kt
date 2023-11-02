package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.unit.dp
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
            Column(modifier = Modifier.padding(AppTheme.Paddings.AppNameColumnPadding))
            {
                Text(
                    text = stringResource(R.string.name_app_in_store),
                    color = AppTheme.TextColors.primary,
                    style = AppTheme.TextStyle.AppNameInStore,
                    modifier = Modifier.padding(AppTheme.Paddings.AppNameTextPadding)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                )
                {
                    Row(
                        modifier = Modifier.width(AppTheme.Sizes.RatingStarsWidth),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ){
                        repeat(5){
                            Image(
                                painter = painterResource(R.drawable.rating_star),
                                contentDescription = "rating star",
                                modifier = Modifier.size(AppTheme.Sizes.RatingStarSize)
                            )

                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = stringResource(id = R.string.reviews_amount),
                        style = AppTheme.TextStyle.NormalText,
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
