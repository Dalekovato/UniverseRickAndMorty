package com.example.universerickandmorty.data.database

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.domain.mapper.dataBase.fromDataBase.CharactersMapperDataBaseFrom
import com.example.universerickandmorty.domain.mapper.dataBase.inDataBase.CharacterMapperDataBaseIn
import com.example.universerickandmorty.domain.mapper.dataBase.inDataBase.CharactersMapperDataBaseIn
import com.example.universerickandmorty.domain.model.CharactersDomain
import io.reactivex.Single

class CharactersDataBaseRepository(
    private val iCharactersDao: ICharactersDao
) {

    fun getCharactersRepositoryDataBase(): Single<List<CharactersEntity>> {
        return iCharactersDao.loadAllCharacters()
    }

    fun saveCharacterRepositoryDataBase( listCharacters : List<CharactersDomain>){
        iCharactersDao.saveAllCharacters(  listCharacters.map {
            CharacterMapperDataBaseIn(it).char
        })
    }


}