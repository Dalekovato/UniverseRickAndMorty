package com.example.universerickandmorty.domain.mapper.database

import com.example.universerickandmorty.data.database.CharactersEntity
import com.example.universerickandmorty.domain.model.CharactersDomainDataBase

class CharacterMapperDataBase(charactersEntity: CharactersEntity) {

    val char by lazy {
        CharactersDomainDataBase(
            id = charactersEntity.id ?: 0,
            name = charactersEntity.name.orEmpty(),
            status = charactersEntity.status.orEmpty(),
            species = charactersEntity.species.orEmpty(),
            type = charactersEntity.type.orEmpty(),
            gender = charactersEntity.gender.orEmpty(),
            origin = charactersEntity.origin.orEmpty(),
            location = charactersEntity.location.orEmpty(),
            image = charactersEntity.image.orEmpty(),
            episode = charactersEntity.episode.orEmpty(),
            url = charactersEntity.url.orEmpty(),
            created = charactersEntity.created.orEmpty()

        )

    }
}