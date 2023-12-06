package com.example.jetpacknews.presentation.details.components

import com.example.jetpacknews.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article): DetailsEvent()

    object RemoveSideEffect: DetailsEvent()

}