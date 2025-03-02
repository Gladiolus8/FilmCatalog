package com.example.domain.usecase

import com.example.domain.model.FilmsModel
import com.example.domain.repository.FilmRepository

class RemoveFavoriteUseCase(
    private val repository: FilmRepository
): (suspend (FilmsModel) -> Unit){
    override suspend fun invoke(filmsModel: FilmsModel) {
        repository.removeFavorite(filmsModel)
    }
}