package com.example.filmcatalog.presentation.navigation

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.domain.model.FilmsModel
import com.example.filmcatalog.presentation.screens.catalog.CatalogFragment
import com.example.filmcatalog.presentation.screens.details.DetailsFragment
import com.example.filmcatalog.presentation.screens.favorites.FavoritesFragment

class FragmentRouter {
    private lateinit var manager: FragmentManager
    private var containerId = -1

    fun setFragmentManager(manager: FragmentManager) {
        this.manager = manager
    }

    fun setContainerId(containerId: Int) {
        this.containerId = containerId
    }

    fun showCatalogFragment() {
        val catalogFragment = manager.findFragmentByTag(CatalogFragment.TAG) ?: CatalogFragment()
        showFragment(catalogFragment, CatalogFragment.TAG)
    }

    fun showFavoritesFragment() {
        val favoritesFragment = manager.findFragmentByTag(FavoritesFragment.TAG) ?: FavoritesFragment()
        showFragment(favoritesFragment, FavoritesFragment.TAG)
    }

    fun showDetailsFragment(filmsModel: FilmsModel) {
        val detailsFragment = manager.findFragmentByTag(DetailsFragment.TAG) ?: DetailsFragment()
        detailsFragment.arguments = bundleOf(DetailsFragment.EXTRA_RECIPE_ID to filmsModel)
        showFragment(detailsFragment, DetailsFragment.TAG)

    }

    fun back() {
        manager.popBackStack()

    }


    private fun showFragment(fragment: Fragment, tag: String) {
        manager.beginTransaction()
            .replace(containerId, fragment, tag)
            .addToBackStack(null)
            .commit()
    }
}