package com.example.domain.repository

import com.example.domain.model.DetailsModel
import com.example.domain.model.FilmsModel
import com.example.domain.model.SearchRequestModel
import kotlinx.coroutines.flow.Flow


interface FilmRepository {
    suspend fun getCatalog(): List<FilmsModel>
    suspend fun getDetails(filmsModel: FilmsModel): DetailsModel
    suspend fun getRecipeByName(filmName: SearchRequestModel): List<FilmsModel>
    suspend fun addFavorite(filmsModel: FilmsModel)
    suspend fun removeFavorite(filmsModel: FilmsModel)
    fun getFavoriteFilms(): Flow<List<FilmsModel>>
}