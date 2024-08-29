package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.OriginDto
import com.example.universerickandmorty.domain.model.OriginDomain

class OriginMapepr(originDto: OriginDto?) {


    val orig by lazy {
        OriginDomain(
            name = originDto?.name.orEmpty(),
            url = originDto?.url.orEmpty()
        )

    }

}