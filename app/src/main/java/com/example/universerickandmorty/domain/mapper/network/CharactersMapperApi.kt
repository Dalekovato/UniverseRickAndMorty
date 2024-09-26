package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dto.CharacterDto

class CharactersMapperApi(characterDto: List<CharacterDto?>?) {

    val character by lazy {
        characterDto?.mapNotNull {
            it?.let { CharacterMapperApi(it).char }
        } ?: emptyList()

    }
}