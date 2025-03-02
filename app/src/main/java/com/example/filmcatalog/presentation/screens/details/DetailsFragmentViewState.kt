package com.example.filmcatalog.presentation.screens.details

sealed class DetailsFragmentViewState {
    data class Ready(
        val detailsItems: List<Int>,
        val isFavorite: Boolean
    ): DetailsFragmentViewState()
    data object Error: DetailsFragmentViewState()
    data object Loading: DetailsFragmentViewState()
}