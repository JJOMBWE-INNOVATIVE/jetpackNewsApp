package com.example.jetpacknews.data.remote.dto

import com.example.jetpacknews.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)