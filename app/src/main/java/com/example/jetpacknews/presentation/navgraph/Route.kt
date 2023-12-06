package com.example.jetpacknews.presentation.navgraph

sealed class Route(
    val route: String
) {
    object OnBoardingScreen : Route("OnBoardingScreen")
    object HomeScreen : Route("HomeScreen")
    object SearchScreen : Route("SearchScreen")
    object BookmarkScreen : Route("BookmarkScreen")
    object DetailsScreen : Route("DetailScreen")
    object AppStartNavigation : Route("AppStartNavigation")
    object NewsNavigation : Route("NewsNavigation")
    object NewsNavigationScreen : Route("NewsNavigator")

}

