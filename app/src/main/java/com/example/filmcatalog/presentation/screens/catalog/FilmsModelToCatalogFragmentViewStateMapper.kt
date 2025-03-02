package com.example.filmcatalog.presentation.screens.catalog

import com.example.domain.model.FilmsModel

object FilmsModelToCatalogFragmentViewStateMapper:((List<FilmsModel>?)->CatalogFragmentViewState) {
    override fun invoke(filmsList: List<FilmsModel>?): CatalogFragmentViewState {
        return when {
            filmsList == null -> CatalogFragmentViewState.Error
            filmsList.isEmpty() -> CatalogFragmentViewState.Empty
            else -> CatalogFragmentViewState.Ready(filmsList)
        }
    }
}