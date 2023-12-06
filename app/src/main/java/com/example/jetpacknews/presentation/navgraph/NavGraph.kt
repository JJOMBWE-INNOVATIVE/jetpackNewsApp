package com.example.jetpacknews.presentation.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.jetpacknews.presentation.new_navigator.components.NewsNavigator
import com.example.jetpacknews.presentation.onboarding.OnBoardingScreen
import com.example.jetpacknews.presentation.onboarding.OnBoardingViewModel


@Composable
fun NavGraph(
    startDestination: String
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(Route.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }
        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigationScreen.route
        ) {
            composable(Route.NewsNavigationScreen.route) {
                NewsNavigator()
            }
        }
    }
}


