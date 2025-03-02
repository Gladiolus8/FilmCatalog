package com.example.domain.usecase

import com.example.domain.model.FilmsModel
import com.example.domain.repository.FilmRepository
import kotlinx.coroutines.flow.Flow

class GetFavoritesUseCase(
    private val repository: FilmRepository
): (()-> Flow<List<FilmsModel>>){
    override fun invoke(): Flow<List<FilmsModel>> {
        return repository.getFavoriteFilms()
    }
}