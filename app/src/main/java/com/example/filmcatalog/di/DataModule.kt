package com.example.filmcatalog.di

import android.content.Context
import com.example.data.repository.FilmRepositoryImpl
import com.example.data.source.FavoriteDBDataSource
import com.example.data.source.FilmNetworkDataSource
import com.example.domain.repository.FilmRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DataModule {

    @Singleton
    @Provides
    fun provideFilmRepository(
        favoriteDBDataSource: FavoriteDBDataSource,
        filmNetworkDataSource: FilmNetworkDataSource
        ): FilmRepository {
        return FilmRepositoryImpl(
            filmNetworkDataSource,
            favoriteDBDataSource,
        )
    }

    @Provides
    fun provideFavoriteDBDataSource(context: Context): FavoriteDBDataSource {
        return FavoriteDBDataSource(context)
    }

    @Provides
    fun provideFilmNetworkDataSource(): FilmNetworkDataSource {
        return FilmNetworkDataSource()
    }

}
