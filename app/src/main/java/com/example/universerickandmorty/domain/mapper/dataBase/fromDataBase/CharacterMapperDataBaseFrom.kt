package com.example.universerickandmorty.domain.mapper.dataBase.fromDataBase

import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork
import com.example.universerickandmorty.domain.model.CharactersDomain
import com.example.universerickandmorty.domain.model.LocationDomain
import com.example.universerickandmorty.domain.model.OriginDomain
import java.util.Locale

class CharacterMapperDataBaseFrom (charactersEntity: CharactersEntity) {

    val char by lazy {
        CharactersDomain(
            id = charactersEntity.id ?: 0,
            name = charactersEntity.name.orEmpty(),
            status = when (charactersEntity.status.lowercase(Locale.getDefault())){
                "alive" -> StatusImgNetwork.ALIVE
                "dead " -> StatusImgNetwork.DEAD
                else -> StatusImgNetwork.UNKNOWN
            },
            species = charactersEntity.species.orEmpty(),
            type = charactersEntity.type.orEmpty(),
            gender = charactersEntity.gender.orEmpty(),
            origin = charactersEntity.origin?.let {
                OriginDomain(
                    name = it.name.orEmpty(),
                    url = it.url.orEmpty()
                )
            }?: OriginDomain("",""),
            location = charactersEntity.location?.let {
                LocationDomain(
                    name = it.name.orEmpty(),
                    url = it.url.orEmpty()
                )
            }?: LocationDomain("",""),
            image = charactersEntity.image.orEmpty(),
            episode = charactersEntity.episode?.mapNotNull { it }.orEmpty(),
            url = charactersEntity.url.orEmpty(),
            created = charactersEntity.created.orEmpty()

        )

    }
}


//charactersEntity.status ?: StatusImgNetwork.UNKNOWN
//charactersEntity.origin
//charactersEntity.location