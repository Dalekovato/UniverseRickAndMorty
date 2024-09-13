package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.InfoDto
import com.example.universerickandmorty.domain.model.InfoDomain

class InfoMapper(infoDto: InfoDto?) {

    val info by lazy {

        InfoDomain(
            count = infoDto?.count?:0 ,
            next = infoDto?.next.orEmpty() ,
            pages = infoDto?.pages?:0 ,
            prev = infoDto?.prev.orEmpty()
        )

    }


}