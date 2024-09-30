package com.example.universerickandmorty.domain.mapper.dataBase.inDataBase

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.domain.model.CharactersDomain

class CharacterMapperDataBaseIn(characterDomain: CharactersDomain) {

    val char by lazy {
        CharactersEntity(
            id = characterDomain.id ,
            name = characterDomain.name,
            status = characterDomain.status,
            species = characterDomain.species,
            type = characterDomain.type,
            gender = characterDomain.gender,
            origin = characterDomain.origin,
            location = characterDomain.location,
            image = characterDomain.image,
            episode = characterDomain.episode,
            url = characterDomain.url,
            created = characterDomain.created

        )

    }

}