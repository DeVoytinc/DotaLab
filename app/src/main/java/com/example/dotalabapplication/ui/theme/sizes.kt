package com.example.dotalabapplication.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


object  Rounds {
    @get:Composable
    val RoundMain get() = 14.dp

    @get:Composable
    val MidleRoundedBox get() = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)
}

object Sizes {
    @get:Composable
    val BorderLogo get() = 2.dp
    @get:Composable
    val LogoSize get() = 88.dp
    @get:Composable
    val MidleBoxSize get() = 65.dp
    @get:Composable
    val TopBoxSize get() = 390.dp
    @get:Composable
    val RatingStarSize get() = 12.dp
    @get:Composable
    val RatingStarsWidth get() = 80.dp
    @get:Composable
    val ScreenHeaderHeight get() = 405.dp
    @get:Composable
    val BackGroungImageHeight get() = 370.dp
    @get:Composable
    val VideoPreviewRowHeight get() = 150.dp
    @get:Composable
    val VideoPreviewRowSpacedBy get() = 10.dp
    @get:Composable
    val VideoPreviewPlayButtonSize get() = 48.dp
    @get:Composable
    val VideoPreviewPlayIconSize get() = 30.dp
    @get:Composable
    val StarsAndReviewsColumnHeight get() = 40.dp
    @get:Composable
    val SpacedBetweenTags get() = 10.dp
    @get:Composable
    val UserAvatarSize get() = 36.dp

}





