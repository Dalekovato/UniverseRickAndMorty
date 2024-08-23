package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.OriginDto
import com.example.universerickandmorty.domain.model.OriginDomain
import javax.inject.Inject

class OriginMapepr@Inject constructor(originDto: OriginDto?) {


    val orig by lazy {
        OriginDomain(
            name = originDto?.name.orEmpty(),
            url = originDto?.url.orEmpty()
        )

    }

}