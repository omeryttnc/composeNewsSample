package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
    https://www.youtube.com/watch?v=PDABkIkDE04&list=PLzZEuVaFb9Exi-pc8qtHBrrLg8bUn-TP6&index=6
}