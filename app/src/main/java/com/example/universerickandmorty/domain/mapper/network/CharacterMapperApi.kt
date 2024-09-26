package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dto.CharacterDto
import com.example.universerickandmorty.data.network.dto.StatusImg
import com.example.universerickandmorty.domain.mapper.LocationMapper
import com.example.universerickandmorty.domain.mapper.OriginMapepr
import com.example.universerickandmorty.domain.model.CharactersDomainApi

class CharacterMapperApi(characterDto: CharacterDto) {

    val char by lazy {
        CharactersDomainApi(
            id = characterDto.id ?: 0,
            name = characterDto.name.orEmpty(),
            status = characterDto.status ?: StatusImg.UNKNOWN,
            species = characterDto.species.orEmpty(),
            type = characterDto.type.orEmpty(),
            gender = characterDto.gender.orEmpty(),
            origin = OriginMapepr(characterDto.origin).orig,
            location = LocationMapper(characterDto.location).loc,
            image = characterDto.image.orEmpty(),
            episode = characterDto.episode?.mapNotNull { it }.orEmpty(),
            url = characterDto.url.orEmpty(),
            created = characterDto.created.orEmpty()

        )

    }

}

