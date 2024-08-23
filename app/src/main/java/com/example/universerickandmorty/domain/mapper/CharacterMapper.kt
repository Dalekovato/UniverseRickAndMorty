package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.CharacterDto
import javax.inject.Inject

class CharacterMapper@Inject constructor(characterDto: List<CharacterDto>?) {

    val character by lazy {
        characterDto?.map {
            CharMapper(it).char
        }?: emptyList()

    }
}