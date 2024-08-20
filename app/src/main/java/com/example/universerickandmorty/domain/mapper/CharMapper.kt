package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.CharacterDto
import com.example.universerickandmorty.domain.model.CharacterDomain

class CharMapper(characterDto: CharacterDto) {

    val char by lazy {

        CharacterDomain(
            id = characterDto.id ?: 0,
            name = characterDto.name.orEmpty(),
            status = characterDto.status.orEmpty(),
            species = characterDto.species.orEmpty(),
            type = characterDto.type.orEmpty(),
            gender = characterDto.gender.orEmpty(),
            origin = OriginMapepr(characterDto.origin).orig,
            location = LocationMapper(characterDto.location).loc,
            image = characterDto.image.orEmpty(),
            episode = characterDto.episode.orEmpty(),
            url = characterDto.url.orEmpty(),
            created = characterDto.created.orEmpty()

        )

    }

}

