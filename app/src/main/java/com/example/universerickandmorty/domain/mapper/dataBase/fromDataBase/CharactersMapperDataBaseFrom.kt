package com.example.universerickandmorty.domain.mapper.dataBase.fromDataBase

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity

class CharactersMapperDataBaseFrom (characterDomain: List<CharactersEntity>) {

    val character by lazy {
        characterDomain.map{
            it.let { CharacterMapperDataBaseFrom(it).char }
        }
    }

}