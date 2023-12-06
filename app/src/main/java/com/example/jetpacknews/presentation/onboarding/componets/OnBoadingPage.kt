package com.example.jetpacknews.presentation.onboarding.componets


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacknews.R
import com.example.jetpacknews.presentation.onboarding.Dimens.MediumPadding1
import com.example.jetpacknews.presentation.onboarding.Dimens.MediumPadding2
import com.example.jetpacknews.presentation.onboarding.page
import com.example.jetpacknews.presentation.onboarding.pages
import com.example.jetpacknews.ui.theme.JetpackNewsTheme

@Composable
fun OnBoardingPage(
    page: page,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {

        Image(
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
        )
        Spacer(modifier = Modifier.height(MediumPadding1))

        Text(
            text = page.title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)

        )

        Text(
            text = page.description,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)

        )


    }

}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    JetpackNewsTheme {
        OnBoardingPage(page = pages[0])
    }

}