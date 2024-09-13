package com.example.universerickandmorty.domain.mapper

import com.example.universerickandmorty.data.dto.CharacterRespopnse
import com.example.universerickandmorty.domain.model.CharacterAllModel
import com.example.universerickandmorty.domain.model.InfoModel

class MapperDDD(characterDto: CharacterRespopnse) {

    val character by lazy {
        CharacterAllModel(
            info = InfoModel(1),
            listCharacters = CharacterMapper(characterDto.results).character
        )
    }
}
