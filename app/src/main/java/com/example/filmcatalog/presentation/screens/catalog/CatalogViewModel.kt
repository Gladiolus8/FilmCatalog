package com.example.filmcatalog.presentation.screens.catalog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.FilmsModel
import com.example.domain.usecase.GetCatalogUseCase
import com.example.domain.usecase.SearchUseCase
import com.example.filmcatalog.presentation.navigation.FragmentRouter
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CatalogViewModel(
    val getCatalogUseCase: GetCatalogUseCase,
    val searchUseCase: SearchUseCase,
    val fragmentRouter: FragmentRouter,
): ViewModel() {
    private val exceptionHandler = CoroutineExceptionHandler { _, _ ->
        CatalogFragmentViewState.Error
        viewModelScope.launch {
            _stateFlow.emit(CatalogFragmentViewState.Error)
        }
    }
    private val _stateFlow = MutableStateFlow<CatalogFragmentViewState>(CatalogFragmentViewState.Loading)
    val stateFlow = _stateFlow.asStateFlow()

    init {
        viewModelScope.launch(exceptionHandler) {
            val viewState = FilmsModelToCatalogFragmentViewStateMapper(getCatalogUseCase())
            _stateFlow.emit(viewState)
        }
    }
    fun onFilmClick(film : FilmsModel) {
        fragmentRouter.showDetailsFragment(film)
    }
}