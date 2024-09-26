package com.example.universerickandmorty.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.universerickandmorty.data.database.CharactersEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME )
data class CharactersEntity (

    @PrimaryKey @ColumnInfo("id") val id: Int?,
    @ColumnInfo("name") val name: String?,
    @ColumnInfo("status") val status: String?,
    @ColumnInfo("species") val species: String?,
    @ColumnInfo("type") val type: String?,
    @ColumnInfo("gender") val gender: String?,
    @ColumnInfo("origin") val origin: String?,
    @ColumnInfo("location") val location: String?,
    @ColumnInfo("image") val image: String?,
    @ColumnInfo("episode") val episode: String?,
    @ColumnInfo("url") val url: String?,
    @ColumnInfo("created") val created: String?,

){
    companion object{
        const val TABLE_NAME = "characters"
    }
}