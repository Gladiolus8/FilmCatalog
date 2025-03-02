package com.example.data.FavoriteDb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteFilmsDataModel (
    @PrimaryKey
    val id: Int,
    val title: String,
    val image: String,
)