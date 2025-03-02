package com.example.data.source

import android.content.Context
import com.example.data.FavoriteDb.FavoriteFilmsDataModel
import com.example.data.FavoriteDb.FavoritesDB

class FavoriteDBDataSource(context: Context) {
    private val favoritesDb = FavoritesDB.getDb(context)

    suspend fun addFavorite(favoriteRecipeDataModel: FavoriteFilmsDataModel) {
        favoritesDb.getDao().insertFilm(favoriteRecipeDataModel)
    }
}