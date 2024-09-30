package com.example.universerickandmorty.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface ICharactersDao {

    @Query("SELECT * FROM ${CharactersEntity.TABLE_NAME}")
    fun loadAllCharacters(): Single<List<CharactersEntity>>

    @Insert
    @JvmSuppressWildcards
    fun saveAllCharacters(entity: List<CharactersEntity>):Completable

}