package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.LocationDtoNetwork
import com.example.universerickandmorty.domain.model.LocationDomain

class LocationMapperNetwork(locationDto: LocationDtoNetwork?) {

    val loc by lazy {
        LocationDomain(
            name = locationDto?.name.orEmpty(),
            url = locationDto?.url.orEmpty()
        )

    }

}