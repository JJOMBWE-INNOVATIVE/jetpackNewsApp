package com.example.jetpacknews.domain.useCases.news

import com.example.jetpacknews.data.local.NewsDao
import com.example.jetpacknews.domain.model.Article

class SelectArticle(
    private var newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article? {
       return newsDao.getArticle(url)
    }
}