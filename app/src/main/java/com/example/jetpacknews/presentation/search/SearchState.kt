package com.example.jetpacknews.presentation.search

import androidx.paging.PagingData
import com.example.jetpacknews.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null,
) {

}