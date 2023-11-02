package com.example.dotalabapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Sizes
import com.example.dotalabapplication.ui.theme.TextColors

@Composable
fun ScrollableChipsRow(
    items: List<String>,
    modifier: Modifier,
    contentPadding: PaddingValues
)
{
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(Sizes.SpacedBetweenTags),
        contentPadding = contentPadding,
        modifier =  modifier
    ){
        items(items.size) { chipText ->
            Chip(text = items[chipText])
        }
    }
}
@Composable
fun Chip(text: String) {
    Surface(
        color = BgColors.tag,
        shape = CircleShape
    ) {
        Text(
            text = text,
            style = AppTheme.TextStyle.Tag,
            color = TextColors.tag,
            modifier = Modifier.padding(Paddings.TagTextPadding)
        )
    }
}

@Preview
@Composable
fun ChipPreview() {
    Chip("MOBA")
}

@Preview
@Composable
fun ScrollableChipsRowPreview(){
    ScrollableChipsRow(
        items = listOf("MOBA", "MULTYPLAYER", "STRATEGY"),
        modifier = Modifier.padding(Paddings.TagsPadding),
        contentPadding = Paddings.MainContentPadding
    )
}