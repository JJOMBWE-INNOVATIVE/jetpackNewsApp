package com.example.jetpacknews.di

import android.app.Application
import androidx.room.Room
import com.example.jetpacknews.data.local.NewsDao
import com.example.jetpacknews.data.local.NewsDatabase
import com.example.jetpacknews.data.local.NewsTypeConvertor
import com.example.jetpacknews.data.manager.LocalUserManagerImpl
import com.example.jetpacknews.data.remote.dto.NewsApi
import com.example.jetpacknews.data.repository.NewsRepositoryImpl
import com.example.jetpacknews.domain.manager.LocalUserManager
import com.example.jetpacknews.domain.repository.NewsRepository
import com.example.jetpacknews.domain.useCases.app_entry.AppEntryUseCases
import com.example.jetpacknews.domain.useCases.app_entry.ReadAppEntry
import com.example.jetpacknews.domain.useCases.app_entry.SaveAppEntry
import com.example.jetpacknews.domain.useCases.news.DeleteArticle
import com.example.jetpacknews.domain.useCases.news.GetNews
import com.example.jetpacknews.domain.useCases.news.NewsUseCases
import com.example.jetpacknews.domain.useCases.news.SearchNews
import com.example.jetpacknews.domain.useCases.news.SelectArticle
import com.example.jetpacknews.domain.useCases.news.SelectArticles
import com.example.jetpacknews.domain.useCases.news.UpsertArticle
import com.example.jetpacknews.util.Constants.BASE_URL
import com.example.jetpacknews.util.Constants.NEWS_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

    @Provides
    @Singleton
    fun provideNewsApi(
    ) : NewsApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi
    ): NewsRepository = NewsRepositoryImpl(newsApi)




    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository,
        newsDao: NewsDao
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository),
            upsertArticle = UpsertArticle(newsDao),
            deleteArticle = DeleteArticle(newsDao),
            selectArticles = SelectArticles(newsDao),
            selectArticle = SelectArticle(newsDao)

        )
    }

    @Provides
    @Singleton
fun provideNewsDataBase(
    application: Application
) : NewsDatabase {
    return Room.databaseBuilder(
         context =  application,
         klass =  NewsDatabase::class.java,
         name = NEWS_DATABASE_NAME
    ).addTypeConverter(NewsTypeConvertor())
        .fallbackToDestructiveMigration()
        .build()
}

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDatabase: NewsDatabase
    ) : NewsDao = newsDatabase.newsDao


}