package com.example.jetpacknews.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpacknews.domain.useCases.app_entry.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel@Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
): ViewModel() {


    fun onEvent(event: OnBoardingEvent) {
        when(event) {
            is OnBoardingEvent.SaveAppEntry -> {
                saveAppEntry()
            }
            is OnBoardingEvent.ReadAppEntry -> {
                readAppEntry()
            }
        }
    }

    private fun readAppEntry() {
        viewModelScope.launch {
            appEntryUseCases.readAppEntry()
        }
    }


    private fun saveAppEntry() {
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry()
        }
    }


}