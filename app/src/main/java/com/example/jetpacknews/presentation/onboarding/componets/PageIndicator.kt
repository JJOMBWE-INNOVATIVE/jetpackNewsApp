package com.example.jetpacknews.presentation.onboarding.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.jetpacknews.presentation.onboarding.Dimens.IndicatorSize
import com.example.jetpacknews.ui.theme.BlueGray


@Composable
fun PageIndicator(
    pageSize: Int,
    selectedPage: Int,
    selectedColor : Color = MaterialTheme.colorScheme.primary,
    modifier: Modifier = Modifier,
    unselectedColor : Color = BlueGray,
) {
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        repeat(pageSize){
           page ->
            Box(modifier = Modifier.size(IndicatorSize).clip(CircleShape)
                .background(color = if (page == selectedPage) selectedColor else unselectedColor))
        }
    }
}