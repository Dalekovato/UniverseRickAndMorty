package com.example.universerickandmorty.data.database

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.Single

@Dao
interface ICharactersDao {

    @Query("SELECT * FROM ${CharactersEntity.TABLE_NAME}")
    fun loadAllCharacters(): Single<List<CharactersEntity>>

}