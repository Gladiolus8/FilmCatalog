package com.example.filmcatalog.di


import com.example.filmcatalog.presentation.activities.MainActivity
import com.example.filmcatalog.presentation.screens.catalog.CatalogFragment
import com.example.filmcatalog.presentation.screens.details.DetailsFragment
import com.example.filmcatalog.presentation.screens.favorites.FavoritesFragment
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, DataModule::class, DomainModule::class])
@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(catalogFragment: CatalogFragment)
    fun inject(favoritesFragment: FavoritesFragment)
    fun inject(detailsFragment: DetailsFragment)
}
