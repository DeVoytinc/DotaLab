package com.example.dotalabapplication.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme

@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item{
            DotaScreenHeader()
        }
        item{
            Text(
                text = stringResource(R.string.description),
                fontFamily = AppTheme.TextStyle.NormalText.fontFamily,
                fontSize = AppTheme.TextStyle.NormalText.fontSize,
                fontStyle = AppTheme.TextStyle.NormalText.fontStyle,
                color = AppTheme.TextColors.DescriptionText,
                modifier = Modifier.padding(AppTheme.Paddings.DescriptionPadding),
            )
        }
        item {
            VideoPreviewRow(
                items = listOf(
                    painterResource(R.drawable.video_preview0),
                    painterResource(R.drawable.videp_preview1)
                ),
                contentPadding = AppTheme.Paddings.VideoPreviewRowcontentPadding
            )
        }
        item{
            Text(
                text = stringResource(id = R.string.reviews_and_rating),
                fontFamily = AppTheme.TextStyle.Bold_48.fontFamily,
                fontWeight = AppTheme.TextStyle.Bold_48.fontWeight,
                modifier = Modifier.padding(
                    AppTheme.Paddings.ReviewAndRatingTextPadding),
                color = AppTheme.TextColors.secondary,
            )
        }
        item{
            RatingBlock(
                rating = 4.9f,
                reviewsCount = stringResource(id = R.string.reviews_amount),
                modifier = Modifier.padding(AppTheme.Paddings.StarsAndReviewsRowPadding)
            )
        }
    }
}
@Preview
@Composable
fun DotaScreenPreview() {
    DotaScreen()
}