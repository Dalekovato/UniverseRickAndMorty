package com.example.universerickandmorty.domain.mapper.dataBase.fromDataBase

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork
import com.example.universerickandmorty.domain.model.CharactersDomain

class CharacterMapperDataBaseFrom (charactersEntity: CharactersEntity) {

    val char by lazy {
        CharactersDomain(
            id = charactersEntity.id ?: 0,
            name = charactersEntity.name.orEmpty(),
            status = charactersEntity.status ?: StatusImgNetwork.UNKNOWN,
            species = charactersEntity.species.orEmpty(),
            type = charactersEntity.type.orEmpty(),
            gender = charactersEntity.gender.orEmpty(),
            origin = charactersEntity.origin,
            location = charactersEntity.location,
            image = charactersEntity.image.orEmpty(),
            episode = charactersEntity.episode?.mapNotNull { it }.orEmpty(),
            url = charactersEntity.url.orEmpty(),
            created = charactersEntity.created.orEmpty()

        )

    }
}