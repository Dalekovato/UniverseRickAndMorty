package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.OriginDtoNetwork
import com.example.universerickandmorty.domain.model.OriginDomain

class OriginMapeprNetwork(originDto: OriginDtoNetwork?) {


    val orig by lazy {
        OriginDomain(
            name = originDto?.name.orEmpty(),
            url = originDto?.url.orEmpty()
        )

    }

}