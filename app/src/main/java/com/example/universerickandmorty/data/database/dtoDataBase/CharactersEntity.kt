package com.example.universerickandmorty.data.database.dtoDataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity.Companion.TABLE_NAME
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Entity(tableName = TABLE_NAME )
data class CharactersEntity (

    @PrimaryKey
        (autoGenerate = true)
    @ColumnInfo
        ("id") val id: Int?,
    @ColumnInfo
        ("name") val name: String?,
    @ColumnInfo
        ("status") val status: String,
    @ColumnInfo
        ("species") val species: String?,
    @ColumnInfo
        ("type") val type: String?,
    @ColumnInfo
        ("gender") val gender: String?,
    @ColumnInfo
        ("origin")
    @TypeConverters(OriginConverter::class)
        val origin: OriginDataBase?,
    @ColumnInfo
        ("location")
    @TypeConverters(LocationConverter::class)
    val location: LocationDataBase?,
    @ColumnInfo
        ("image") val image: String?,
    @ColumnInfo
        ("episode")
    @TypeConverters(ConvertersEpisode::class)
    val episode: List<String?>?,
    @ColumnInfo
        ("url") val url: String?,
    @ColumnInfo
        ("created") val created: String?,

    ){
    companion object{
        const val TABLE_NAME = "characters"
    }
}

class ConvertersEpisode {
    @TypeConverter
    fun fromStringList(value: List<String>): String {
        return Gson().toJson(value) // Преобразование списка в строку (JSON)
    }

    @TypeConverter
    fun toStringList(value: String): List<String> {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(value, listType) // Преобразование строки обратно в список
    }
}
