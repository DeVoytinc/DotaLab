package com.example.dotalabapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotalabapplication.models.CommentUI
import com.example.dotalabapplication.models.Comments
import com.example.dotalabapplication.ui.theme.AppTheme
import com.example.dotalabapplication.ui.theme.Paddings
import com.example.dotalabapplication.ui.theme.Sizes
import com.example.dotalabapplication.ui.theme.TextColors

@Composable
fun Comment(UserComment: CommentUI){
    Column(modifier = Modifier.padding(Paddings.MainContentPadding)) {
        Row() {
            Box(
                modifier = Modifier
                    .size(Sizes.UserAvatarSize)
                    .clip(CircleShape)
                    .background(Color.Red)
            ){
                Image(
                    painter = painterResource(id = UserComment.user.iconId),
                    contentDescription = "Avatar")
            }
            Column(
                modifier = Modifier
                    .height(Sizes.UserAvatarSize)
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween,


            ) {
                Text(
                    text = UserComment.user.name,
                    style = AppTheme.TextStyle.NormalText,
                    color = TextColors.primary
                )
                Text(
                    text = UserComment.comment.date,
                    style = AppTheme.TextStyle.NormalText,
                    color = TextColors.date
                )
            }
        }
        Text(
            text = UserComment.comment.message,
            style = AppTheme.TextStyle.NormalText,
            color = TextColors.message,
            modifier = Modifier.padding(Paddings.TextMessagePadding)

        )
    }
}

@Preview
@Composable
fun CommentPreview(){
    Comment(Comments[0])
}