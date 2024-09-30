package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.CharacterDtoNetwork
import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork
import com.example.universerickandmorty.domain.model.CharactersDomain

class CharacterMapperNetwork(characterDto: CharacterDtoNetwork) {

    val char by lazy {
        CharactersDomain(
            id = characterDto.id ?: 0,
            name = characterDto.name.orEmpty(),
            status = characterDto.status ?: StatusImgNetwork.UNKNOWN,
            species = characterDto.species.orEmpty(),
            type = characterDto.type.orEmpty(),
            gender = characterDto.gender.orEmpty(),
            origin = OriginMapeprNetwork(characterDto.origin).orig,
            location = LocationMapperNetwork(characterDto.location).loc,
            image = characterDto.image.orEmpty(),
            episode = characterDto.episode?.mapNotNull { it }.orEmpty(),
            url = characterDto.url.orEmpty(),
            created = characterDto.created.orEmpty()

        )

    }

}

