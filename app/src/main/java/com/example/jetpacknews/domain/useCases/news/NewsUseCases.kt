package com.example.jetpacknews.domain.useCases.news

data class NewsUseCases(
    val  getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticle: UpsertArticle,
    val deleteArticle: DeleteArticle,
    val selectArticles: SelectArticles,
    val selectArticle: SelectArticle

)
