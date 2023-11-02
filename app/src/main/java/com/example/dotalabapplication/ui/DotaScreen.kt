package com.example.dotalabapplication.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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
                modifier = AppTheme.Paddings.DescriptionPadding,
            )
        }
    }
}