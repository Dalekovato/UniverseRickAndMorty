package com.example.universerickandmorty.domain.mapper.dataBase.inDataBase

import com.example.universerickandmorty.domain.model.CharactersDomain

class CharactersMapperDataBaseIn(characterDomain: List<CharactersDomain>) {

    val character by lazy {
        characterDomain.map{
            it.let { CharacterMapperDataBaseIn(it).char }
        }
    }

}