package com.example.dotalabapplication.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.BgColors
import com.example.dotalabapplication.ui.theme.ButtonColors
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Rounds

@Composable
fun InstallButton(){
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(Paddings.MainContentPadding),
        shape = RoundedCornerShape(Rounds.RoundMain),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColors.main,
            contentColor = BgColors.primary
        ),

        ) {
        Text(
            text = "Install",
            color = BgColors.primary,
            style = AppTheme.TextStyle.ButtonText
        )
    }
}

@Preview
@Composable
fun InstallButtonPreview(){
    InstallButton()
}