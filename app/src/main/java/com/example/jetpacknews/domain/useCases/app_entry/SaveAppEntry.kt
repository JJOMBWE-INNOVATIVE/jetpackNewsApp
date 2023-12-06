package com.example.jetpacknews.domain.useCases.app_entry

import com.example.jetpacknews.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke (){
        localUserManager.saveAppEntry()
    }

}