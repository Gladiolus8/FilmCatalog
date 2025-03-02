package com.example.data.FavoriteDb

import androidx.room.Query
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import kotlinx.coroutines.flow.Flow


@Dao
internal interface Dao {
//    @Query("SELECT * FROM favorites")
//    fun getAllFavoriteRecipes(): Flow<List<FavoriteFilmsDataModel>>
//
    @Insert
    suspend fun insertFilm(recipe: FavoriteFilmsDataModel)

    @Delete
    suspend fun removeRecipe(recipe: FavoriteFilmsDataModel)

//    @Query("SELECT * FROM favorites WHERE id = :recipeId LIMIT 1")
//    suspend fun checkFavorite(recipeId: Int): FavoriteFilmsDataModel?
}