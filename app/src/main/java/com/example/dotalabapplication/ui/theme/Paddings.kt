package com.example.dotalabapplication.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

object  Paddings {
    @get:Composable
    val AppNameColumnPadding get() = PaddingValues(
        top = 30.dp, start = 14.dp)
    @get:Composable
    val AppNameTextPadding get() = PaddingValues(
        bottom = 5.dp)
    @get:Composable
    val LeftPadding get() =
        24.dp
    @get:Composable
    val LogoPadding get() =
        17.dp
    @get:Composable
    val DescriptionPadding get() = PaddingValues(
        start = 24.dp, top = 14.dp, bottom = 14.dp, end = 24.dp)
    @get:Composable
    val MainContentPadding get() = PaddingValues(
        start = 24.dp,end = 24.dp)
    @get:Composable
    val StarsAndReviewsColumnPadding get() = PaddingValues(
        start = 10.dp, top = 5.dp)
    @get:Composable
    val StarsAndReviewsRowPadding get() = PaddingValues(
        start = 24.dp, end = 24.dp, bottom = 16.dp)
    @get:Composable
    val ReviewAndRatingTextPadding get() = PaddingValues(
        start = 24.dp, end = 24.dp, top = 20.dp, bottom = 12.dp)
    @get:Composable
    val TagsPadding get() = PaddingValues(
        top = 16.dp, bottom = 16.dp)
    @get:Composable
    val TagTextPadding get() = PaddingValues(
        vertical = 5.dp, horizontal = 10.dp)
    @get:Composable
    val TextMessagePadding get() = PaddingValues(
    top = 18.dp, bottom = 24.dp)

    @get:Composable
    val DividerPadding get() = PaddingValues(
    top = 5.dp,bottom = 24.dp,start = 38.dp,end = 38.dp)

}