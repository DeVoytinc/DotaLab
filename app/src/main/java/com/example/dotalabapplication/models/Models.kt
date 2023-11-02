package com.example.dotalabapplication.models

import com.example.dotalabapplication.R

class User (val name: String, val iconId: Int)
class Comment (val date: String, val message: String)
class CommentUI (val user: User, val comment: Comment)

val Comments = listOf<CommentUI>(
    CommentUI(
        User(
            name = "Auguste Conte",
            iconId = R.drawable.user_avatar_0,
        ),
        Comment(
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    CommentUI(
        User(
            name = "Jang Marcelino",
            iconId = R.drawable.user_avatar_1,
        ),
        Comment(
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    )
)

