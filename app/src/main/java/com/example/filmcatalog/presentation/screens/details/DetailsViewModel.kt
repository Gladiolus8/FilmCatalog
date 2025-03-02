package com.example.filmcatalog.presentation.screens.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.FilmsModel
import com.example.domain.usecase.AddFavoriteUseCase
import com.example.domain.usecase.GetDetailsUseCase
import com.example.domain.usecase.RemoveFavoriteUseCase
import com.example.filmcatalog.presentation.navigation.FragmentRouter
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class DetailsViewModel(
    private val getDetailsUseCase: GetDetailsUseCase,
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val fragmentRouter: FragmentRouter,
): ViewModel() {

    private lateinit var currentRecipeModel: FilmsModel
    private val exceptionHandler = CoroutineExceptionHandler { _, _ ->
        DetailsFragmentViewState.Error
        viewModelScope.launch {
            _stateFlow.emit(DetailsFragmentViewState.Error)
        }
    }
    private val _stateFlow = MutableStateFlow<DetailsFragmentViewState>(DetailsFragmentViewState.Loading)
}