package com.example.data.repository

import com.example.data.source.FavoriteDBDataSource
import com.example.data.source.FilmNetworkDataSource
import com.example.domain.model.DetailsModel
import com.example.domain.model.FilmsModel
import com.example.domain.model.SearchRequestModel
import com.example.domain.repository.FilmRepository
import kotlinx.coroutines.flow.Flow

class FilmRepositoryImpl(
    private val filmNetworkDataSource: FilmNetworkDataSource,
    private val favoriteDBDataSource: FavoriteDBDataSource,
): FilmRepository {
    override suspend fun getCatalog(): List<FilmsModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getDetails(filmsModel: FilmsModel): DetailsModel {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipeByName(filmName: SearchRequestModel): List<FilmsModel> {
        TODO("Not yet implemented")
    }

    override suspend fun addFavorite(filmsModel: FilmsModel) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFavorite(filmsModel: FilmsModel) {
        TODO("Not yet implemented")
    }

    override fun getFavoriteFilms(): Flow<List<FilmsModel>> {
        TODO("Not yet implemented")
    }
}