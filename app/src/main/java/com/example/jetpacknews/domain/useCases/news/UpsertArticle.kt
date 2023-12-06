package com.example.jetpacknews.domain.useCases.news

import com.example.jetpacknews.data.local.NewsDao
import com.example.jetpacknews.domain.model.Article

class UpsertArticle(
    private var newsDao: NewsDao
) {

        suspend operator fun invoke(article: Article) {
            newsDao.upsert(article)
        }
}