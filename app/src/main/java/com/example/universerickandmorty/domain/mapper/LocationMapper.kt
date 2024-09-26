package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.network.dto.LocationDto
import com.example.universerickandmorty.domain.model.LocationDomain

class LocationMapper(locationDto: LocationDto?) {

    val loc by lazy {
        LocationDomain(
            name = locationDto?.name.orEmpty(),
            url = locationDto?.url.orEmpty()
        )

    }

}