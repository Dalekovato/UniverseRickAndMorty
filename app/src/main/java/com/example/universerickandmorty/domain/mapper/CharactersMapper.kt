package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.CharacterDto

class CharactersMapper(characterDto: List<CharacterDto?>?) {

    val character by lazy {
        characterDto?.mapNotNull {
            it?.let { CharacterMapper(it).char }
        } ?: emptyList()

    }
}