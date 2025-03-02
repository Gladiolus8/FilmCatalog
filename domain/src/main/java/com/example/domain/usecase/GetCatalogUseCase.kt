package com.example.domain.usecase

import com.example.domain.model.FilmsModel
import com.example.domain.repository.FilmRepository

class GetCatalogUseCase(
    private val filmRepository: FilmRepository
): (suspend  ()->List<FilmsModel>) {
    override suspend fun invoke(): List<FilmsModel> {
        return filmRepository.getCatalog()
    }

}