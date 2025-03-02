package com.example.domain.usecase

import com.example.domain.model.DetailsModel
import com.example.domain.model.FilmsModel
import com.example.domain.repository.FilmRepository

class GetDetailsUseCase(
    private val repository: FilmRepository
):(suspend  (FilmsModel)-> DetailsModel) {
    override suspend fun invoke(filmsModel: FilmsModel): DetailsModel {
        return repository.getDetails(filmsModel)
    }
}