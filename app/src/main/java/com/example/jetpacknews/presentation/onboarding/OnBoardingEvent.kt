package com.example.jetpacknews.presentation.onboarding

 sealed class OnBoardingEvent {

     object SaveAppEntry: OnBoardingEvent()
     object ReadAppEntry: OnBoardingEvent()

}