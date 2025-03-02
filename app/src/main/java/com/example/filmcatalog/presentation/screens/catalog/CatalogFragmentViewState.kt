package com.example.filmcatalog.presentation.screens.catalog

import com.example.domain.model.FilmsModel

sealed class CatalogFragmentViewState {
    data class Ready(val list: List<FilmsModel>): CatalogFragmentViewState()
    data object Error: CatalogFragmentViewState()
    data object Empty: CatalogFragmentViewState()
    data object Loading: CatalogFragmentViewState()
}