package com.example.filmcatalog.di

import com.example.domain.repository.FilmRepository
import com.example.domain.usecase.AddFavoriteUseCase
import com.example.domain.usecase.GetCatalogUseCase
import com.example.domain.usecase.GetDetailsUseCase
import com.example.domain.usecase.GetFavoritesUseCase
import com.example.domain.usecase.RemoveFavoriteUseCase
import com.example.domain.usecase.SearchUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun provideGetCatalogUseCase(recipeRepository: FilmRepository): GetCatalogUseCase {
        return GetCatalogUseCase(recipeRepository)
    }

    @Provides
    fun provideGetFavoritesUseCase(recipeRepository: FilmRepository): GetFavoritesUseCase {
        return GetFavoritesUseCase(recipeRepository)
    }

    @Provides
    fun provideGetDetailsUseCase(recipeRepository: FilmRepository): GetDetailsUseCase {
        return GetDetailsUseCase(recipeRepository)
    }

    @Provides
    fun provideSearchUseCase(recipeRepository: FilmRepository): SearchUseCase {
        return SearchUseCase(recipeRepository)
    }

    @Provides
    fun provideAddFavoriteUseCase(recipeRepository: FilmRepository): AddFavoriteUseCase {
        return AddFavoriteUseCase(recipeRepository)
    }

    @Provides
    fun provideRemoveFavoriteUseCase(recipeRepository: FilmRepository): RemoveFavoriteUseCase {
        return RemoveFavoriteUseCase(recipeRepository)
    }
}
