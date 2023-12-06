package com.example.jetpacknews.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.jetpacknews.domain.useCases.news.NewsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeviewModel@Inject constructor(
    private var newsUseCases: NewsUseCases
): ViewModel() {
  val  news = newsUseCases.getNews(
        sources = listOf("bbc-news","cnn","fox-news","google-news","al-jazeera-english"
            ,"associated-press","axios","bleacher-report","bloomberg",
            "business-insider","cbc-news","cbs-news","cnbc",
            "entertainment-weekly","espn","fortune","fox-sports","google-news-au",
            "google-news-ca","google-news-in","google-news-uk",
            "hacker-news","medical-news-today","msnbc",
            "mtv-news","national-geographic","national-review",
            "nbc-news","new-scientist","news24","newsweek","new-york-magazine",
            "next-big-future","nfl-news","nhl-news","politico","reuters",
            "the-american-conservative","the-hill","the-huffington-post",
            "the-next-web","the-times-of-india","the-verge",
            "the-washington-post","the-wall-street-journal","the-new-york-times",
            "the-new-york-times")
  ).cachedIn(viewModelScope)
}