package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Sizes
import com.example.dotalabapplication.ui.theme.TextColors

@Composable
fun RatingBlock(
    rating: Float,
    reviewsCount: String,
    modifier: Modifier
){
    Row(modifier = modifier){
        Text(
            text = rating.toString(),
            style = AppTheme.TextStyle.Bold_48,
            color = TextColors.primary,
        )
        Column(modifier = Modifier
            .align(Alignment.CenterVertically)
            .height(Sizes.StarsAndReviewsColumnHeight)
            .padding(Paddings.StarsAndReviewsColumnPadding),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start) {
            Row(
                modifier = Modifier.width(Sizes.RatingStarsWidth),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5){
                    Image(
                        painter = painterResource(R.drawable.rating_star),
                        contentDescription = "rating star",
                        modifier = Modifier.size(Sizes.RatingStarSize)
                    )
                }
            }
            Text(
                text = "$reviewsCount" + " " + stringResource(id = R.string.reviews),
                style = AppTheme.TextStyle.NormalText,
                color = TextColors.ReviewsBlockText,
            )
        }
    }
}

@Preview
@Composable
fun RatingBlockPreview(){
    RatingBlock(rating = 4.9f, reviewsCount = stringResource(id = R.string.reviews_amount),
        modifier = Modifier.padding(Paddings.StarsAndReviewsRowPadding)
    )
}