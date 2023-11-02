package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.R
import com.example.dotalabapplication.models.Comments
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.TextColors

@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item{
            DotaScreenHeader()
        }
        item{
            ScrollableChipsRow(
                items = listOf("MOBA", "MULTYPLAYER", "STRATEGY"),
                modifier = Modifier.padding(Paddings.TagsPadding),
                contentPadding = Paddings.MainContentPadding
            )
        }
        item{
            Text(
                text = stringResource(R.string.description),
                fontFamily = AppTheme.TextStyle.NormalText.fontFamily,
                fontSize = AppTheme.TextStyle.NormalText.fontSize,
                fontStyle = AppTheme.TextStyle.NormalText.fontStyle,
                color = TextColors.DescriptionText,
                modifier = Modifier.padding(Paddings.DescriptionPadding),
            )
        }
        item {
            VideoPreviewRow(
                items = listOf(
                    painterResource(R.drawable.video_preview0),
                    painterResource(R.drawable.videp_preview1)
                ),
                contentPadding = Paddings.MainContentPadding
            )
        }
        item{
            Text(
                text = stringResource(id = R.string.reviews_and_rating),
                fontFamily = AppTheme.TextStyle.Bold_48.fontFamily,
                fontWeight = AppTheme.TextStyle.Bold_48.fontWeight,
                modifier = Modifier.padding(
                    Paddings.ReviewAndRatingTextPadding),
                color = TextColors.secondary,
            )
        }
        item{
            RatingBlock(
                rating = 4.9f,
                reviewsCount = stringResource(id = R.string.reviews_amount),
                modifier = Modifier.padding(Paddings.StarsAndReviewsRowPadding)
            )
        }
        itemsIndexed(Comments) { index, item ->
            Comment(item)
            if (index < Comments.lastIndex) {
                Divider(
                    color = BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(Paddings.DividerPadding)
                )
            }
        }
        item { 
            Spacer(modifier = Modifier.height(250.dp))
        }
    }
}
@Preview
@Composable
fun DotaScreenPreview() {
    DotaScreen()
}