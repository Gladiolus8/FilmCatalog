package com.example.domain.usecase

import com.example.domain.model.FilmsModel
import com.example.domain.model.SearchRequestModel
import com.example.domain.repository.FilmRepository

class SearchUseCase(
    private val repository: FilmRepository
): suspend (SearchRequestModel)->List<FilmsModel> {
    override suspend fun invoke(filmName: SearchRequestModel): List<FilmsModel> {
        return repository.getRecipeByName(filmName)
    }
}