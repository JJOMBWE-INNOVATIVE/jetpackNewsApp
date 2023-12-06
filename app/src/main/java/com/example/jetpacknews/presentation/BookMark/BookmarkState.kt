package com.example.jetpacknews.presentation.BookMark

import com.example.jetpacknews.domain.model.Article


data class BookmarkState(
    val articles: List<Article> = emptyList()
)