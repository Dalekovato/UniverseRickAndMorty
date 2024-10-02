package com.example.universerickandmorty.domain.mapper.dataBase.inDataBase

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.data.database.dtoDataBase.LocationDataBase
import com.example.universerickandmorty.data.database.dtoDataBase.OriginDataBase
import com.example.universerickandmorty.domain.model.CharactersDomain

class CharacterMapperDataBaseIn(characterDomain: CharactersDomain) {

    val char by lazy {
        CharactersEntity(
            id = characterDomain.id ,
            name = characterDomain.name,
            status = characterDomain.status.toString(),
            species = characterDomain.species,
            type = characterDomain.type,
            gender = characterDomain.gender,
            origin = characterDomain.origin.let {
                OriginDataBase(
                    name = it.name,
                    url = it.url
                )
            },
            location = characterDomain.location.let {
                LocationDataBase(
                    name = it.name,
                    url = it.url
                )
            },
            image = characterDomain.image,
            episode = characterDomain.episode,
            url = characterDomain.url,
            created = characterDomain.created

        )

    }

}