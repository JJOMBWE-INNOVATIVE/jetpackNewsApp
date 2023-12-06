package com.example.jetpacknews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.jetpacknews.R

data class page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int

)

val pages = listOf(

    page(
        title = "Welcome to Jetpack News",
        description = "Jetpack News is a news app that uses the latest jetpack libraries",
        image = R.drawable.onboarding1
    ),
    page(
        title = "Built with Compose",
        description = "Jetpack News is built with Jetpack Compose",
        image = R.drawable.onboarding2
    ),
    page(
        title = "Built with Compose",
        description = "Jetpack News is built with Jetpack Compose",
        image = R.drawable.onboarding3
    ),


)