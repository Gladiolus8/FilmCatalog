package com.example.filmcatalog.di

import android.content.Context

import com.example.domain.usecase.AddFavoriteUseCase
import com.example.domain.usecase.GetCatalogUseCase
import com.example.domain.usecase.GetDetailsUseCase
import com.example.domain.usecase.GetFavoritesUseCase
import com.example.domain.usecase.RemoveFavoriteUseCase
import com.example.domain.usecase.SearchUseCase
import com.example.filmcatalog.presentation.navigation.FragmentRouter
import com.example.filmcatalog.presentation.screens.catalog.CatalogViewModel
import com.example.filmcatalog.presentation.screens.details.DetailsViewModel
import com.example.filmcatalog.presentation.screens.favorites.FavoritesViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideRouter(): FragmentRouter {
        return FragmentRouter()
    }

    @Provides
    fun provideCatalogViewModel(
        getCatalogUseCase: GetCatalogUseCase,
        searchUseCase: SearchUseCase,
        fragmentRouter: FragmentRouter,
    ): CatalogViewModel {
        return CatalogViewModel(
            getCatalogUseCase,
            searchUseCase,
            fragmentRouter,
        )
    }

    @Provides
    fun provideFavoritesViewModel(
        getFavoritesUseCase: GetFavoritesUseCase,
        fragmentRouter: FragmentRouter,
    ): FavoritesViewModel {
        return FavoritesViewModel(
            getFavoritesUseCase,
            fragmentRouter,
        )
    }

    @Provides
    fun provideDetailsViewModel(
        getDetailsUseCase: GetDetailsUseCase,
        addFavoriteUseCase: AddFavoriteUseCase,
        removeFavoriteUseCase: RemoveFavoriteUseCase,
        fragmentRouter: FragmentRouter,
    ): DetailsViewModel {
        return DetailsViewModel(
            getDetailsUseCase,
            addFavoriteUseCase,
            removeFavoriteUseCase,
            fragmentRouter,
        )
    }
}
