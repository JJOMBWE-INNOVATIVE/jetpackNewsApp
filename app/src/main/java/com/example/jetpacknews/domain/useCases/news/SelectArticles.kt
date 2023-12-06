package com.example.jetpacknews.domain.useCases.news

import com.example.jetpacknews.data.local.NewsDao
import com.example.jetpacknews.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private var newsDao: NewsDao
) {

     operator fun invoke():Flow<List<Article>> {
      return  newsDao.getArticles()
    }
}