package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.CharacterDto

class CharacterMapper(characterDto: List<CharacterDto>?) {

    val character by lazy {
        characterDto?.filterNotNull()?.map {
            CharMapper(it).char
        }?: emptyList()

    }
}