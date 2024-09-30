package com.example.universerickandmorty.data.database.dtoDataBase

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class OriginDataBase(

    val name: String?,
    val url: String?,

 )

class OriginConverter {
    @TypeConverter
    fun fromOrigin(origin: OriginDataBase): String {
        return Gson().toJson(origin) // Преобразование объекта в строку (JSON)
    }

    @TypeConverter
    fun toOrigin(originString: String): OriginDataBase {
        val type = object : TypeToken<OriginDataBase>() {}.type
        return Gson().fromJson(originString, type) // Преобразование строки обратно в объект
    }
}

