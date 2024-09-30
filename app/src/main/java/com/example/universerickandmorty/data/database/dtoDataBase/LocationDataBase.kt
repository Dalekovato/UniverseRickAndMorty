package com.example.universerickandmorty.data.database.dtoDataBase

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class LocationDataBase (

    val name: String?,
    val url: String?,

)

class LocationConverter {
    @TypeConverter
    fun fromLocation(location: LocationDataBase): String {
        return Gson().toJson(location) // Преобразование объекта в строку (JSON)
    }

    @TypeConverter
    fun toLocation(locationString: String): LocationDataBase {
        val type = object : TypeToken<LocationDataBase>() {}.type
        return Gson().fromJson(locationString, type) // Преобразование строки обратно в объект
    }
}