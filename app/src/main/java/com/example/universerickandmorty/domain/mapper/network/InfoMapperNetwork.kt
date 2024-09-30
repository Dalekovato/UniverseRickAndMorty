package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.InfoDtoNetwork
import com.example.universerickandmorty.domain.model.InfoDomain

class InfoMapperNetwork(infoDto: InfoDtoNetwork?) {

    val info by lazy {

        InfoDomain(
            count = infoDto?.count?:0 ,
            next = infoDto?.next.orEmpty() ,
            pages = infoDto?.pages?:0 ,
            prev = infoDto?.prev.orEmpty()
        )

    }


}