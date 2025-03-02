package com.example.filmcatalog.presentation.screens.favorites

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.GetFavoritesUseCase
import com.example.filmcatalog.presentation.navigation.FragmentRouter

class FavoritesViewModel(
    val getFavoritesUseCase: GetFavoritesUseCase,
    val fragmentRouter: FragmentRouter,
): ViewModel(){
}