package com.example.universerickandmorty.presentation

import com.example.universerickandmorty.domain.model.CharacterDomain

class CharSummaryMapper(characterDomain: CharacterDomain) {

    val charShortInf by lazy {
        CharacterModel(
            imgPhoto = characterDomain.image ,
            tvName = characterDomain.name,
            tvStatus = characterDomain.status,
            tvSpecies = characterDomain.species
        )
    }

}