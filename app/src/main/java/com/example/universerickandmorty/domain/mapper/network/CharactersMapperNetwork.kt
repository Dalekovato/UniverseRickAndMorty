package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.CharacterDtoNetwork

class CharactersMapperNetwork(characterDto: List<CharacterDtoNetwork?>?) {

    val character by lazy {
        characterDto?.mapNotNull {
            it?.let { CharacterMapperNetwork(it).char }
        } ?: emptyList()

    }
}