package com.example.universerickandmorty.domain.mapper.database

import com.example.universerickandmorty.data.database.CharactersEntity

class CharactersMapperDataBase (charactersEntity: List<CharactersEntity?>?){

    val character by lazy {
        charactersEntity?.filterNotNull()?.map {
            CharacterMapperDataBase(it).char
        } ?: emptyList()
    }
}