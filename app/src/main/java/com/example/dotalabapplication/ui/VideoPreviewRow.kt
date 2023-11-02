package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme

@Composable
fun VideoPreviewRow(
    items: List<Painter>,
    contentPadding: PaddingValues
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(AppTheme.Sizes.VideoPreviewRowSpacedBy),
        contentPadding = contentPadding
    ) {
        items(items.size) { previewText ->
            Box() {
                Image(
                    painter = items[previewText],
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(AppTheme.Sizes.VideoPreviewRowHeight)
                        .clip(shape = RoundedCornerShape(AppTheme.Rounds.RoundMain))
                )
                Box(modifier = Modifier
                    .align(Alignment.Center)
                    .background(AppTheme.BgColors.VideoPlayTransparentColor, CircleShape)
                    .clip(shape = CircleShape)
                    .size(AppTheme.Sizes.VideoPreviewPlayButtonSize)
                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = "Play",
                        tint = AppTheme.BgColors.IconPlayOnvideoRowColor,
                        modifier = Modifier
                            .size(AppTheme.Sizes.VideoPreviewPlayIconSize)
                            .align(alignment = Alignment.Center)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewVideoPreviewRow(){
    VideoPreviewRow(
        items = listOf(
            painterResource(R.drawable.video_preview0),
            painterResource(R.drawable.videp_preview1)
        ),
        contentPadding = AppTheme.Paddings.VideoPreviewRowcontentPadding
    )
}
