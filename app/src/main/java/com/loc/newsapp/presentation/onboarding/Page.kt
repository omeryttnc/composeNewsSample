package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ippsum title",
        description = "Lorem ipsum description",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ippsum title",
        description = "Lorem ipsum description",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ippsum title",
        description = "Lorem ipsum description",
        image = R.drawable.onboarding3
    ),
)
