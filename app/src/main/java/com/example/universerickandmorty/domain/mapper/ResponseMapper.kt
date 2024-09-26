package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.network.dto.CharacterRespopnse
import com.example.universerickandmorty.domain.mapper.network.CharactersMapperApi
import com.example.universerickandmorty.domain.model.ResponseDomain

class ResponseMapper(characterResp: CharacterRespopnse) {

    val respopnse by lazy {
        ResponseDomain(
            info = InfoMapper(characterResp.info).info ,
            listCharacters = CharactersMapperApi(characterResp.results).character
        )
    }
}
