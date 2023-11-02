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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.R
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Rounds
import com.example.dotalabapplication.ui.theme.Sizes

@Composable
fun VideoPreviewRow(
    items: List<Painter>,
    contentPadding: PaddingValues
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(Sizes.VideoPreviewRowSpacedBy),
        contentPadding = contentPadding
    ) {
        items(items.size) { previewText ->
            Box() {
                Image(
                    painter = items[previewText],
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(Sizes.VideoPreviewRowHeight)
                        .clip(shape = RoundedCornerShape(Rounds.RoundMain))
                )
                Button(
                    onClick = {  },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BgColors.VideoPlayTransparentColor,
                        contentColor = BgColors.IconPlayOnvideoRowColor
                    ),
                    shape = CircleShape,
                    contentPadding = PaddingValues(1.dp),
                    modifier = Modifier
                        .size(Sizes.VideoPreviewPlayButtonSize)
                        .align(alignment = Alignment.Center)

                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = "Play",
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
        contentPadding = Paddings.MainContentPadding
    )
}
