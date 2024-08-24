package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.LocationDto
import com.example.universerickandmorty.domain.model.LocationDomain
import javax.inject.Inject

class LocationMapper(locationDto: LocationDto?) {

    val loc by lazy {
        LocationDomain(
            name = locationDto?.name.orEmpty(),
            url = locationDto?.url.orEmpty()
        )

    }

}