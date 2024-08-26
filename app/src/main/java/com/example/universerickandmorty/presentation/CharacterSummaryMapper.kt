package com.example.universerickandmorty.presentation

import com.example.universerickandmorty.domain.model.CharacterDomain

class CharacterSummaryMapper(characterDomain: List<CharacterDomain>) {

    val characterShortInf by lazy {
        characterDomain.map {
            CharSummaryMapper(it).charShortInf
        }
    }

}