package com.example.dotalabapplication.ui

import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.graphics.Brush
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
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Rounds
import com.example.dotalabapplication.ui.theme.Sizes
import com.example.dotalabapplication.ui.theme.TextColors


@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier
        .height(Sizes.ScreenHeaderHeight)
        .fillMaxWidth())
    {
        Image(
            painter = painter,
            contentDescription = "Dota background",
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter,
            modifier = Modifier
                .height(Sizes.BackGroungImageHeight)
                .fillMaxSize()
        )
        val brush = Brush.verticalGradient(listOf(Color.Black, Color.Transparent))
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            onDraw ={ drawRect(brush) }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(Sizes.MidleBoxSize)
                .align(alignment = Alignment.BottomCenter)
                .background(
                    color = Color(BgColors.primary.toArgb()),
                    Rounds.MidleRoundedBox
                )
        )
        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(horizontal = Paddings.LeftPadding)
        )
        {
            DotaLogo()
            Column(modifier = Modifier.padding(Paddings.AppNameColumnPadding))
            {
                Text(
                    text = stringResource(R.string.name_app_in_store),
                    color = TextColors.primary,
                    style = AppTheme.TextStyle.AppNameInStore,
                    modifier = Modifier.padding(Paddings.AppNameTextPadding)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                )
                {
                    Row(
                        modifier = Modifier.width(Sizes.RatingStarsWidth),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ){
                        repeat(5){
                            Image(
                                painter = painterResource(R.drawable.rating_star),
                                contentDescription = "rating star",
                                modifier = Modifier.size(Sizes.RatingStarSize)
                            )

                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = stringResource(id = R.string.reviews_amount),
                        style = AppTheme.TextStyle.NormalText,
                        color = TextColors.ReviewsText,
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
