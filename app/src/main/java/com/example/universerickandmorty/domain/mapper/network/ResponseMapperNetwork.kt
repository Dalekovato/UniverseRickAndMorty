package com.example.universerickandmorty.domain.mapper.network

import com.example.universerickandmorty.data.network.dtoNetwork.CharacterRespopnseNetwork
import com.example.universerickandmorty.domain.model.ResponseDomain

class ResponseMapperNetwork(characterResp: CharacterRespopnseNetwork) {

    val respopnse by lazy {
        ResponseDomain(
            info = InfoMapperNetwork(characterResp.info).info ,
            listCharacters = CharactersMapperNetwork(characterResp.results).character
        )
    }
}
