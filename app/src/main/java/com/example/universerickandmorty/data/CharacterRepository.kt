package com.example.universerickandmorty.data

import com.example.universerickandmorty.domain.mapper.CharacterMapper
import com.example.universerickandmorty.domain.model.CharacterDomain
import io.reactivex.Single
import javax.inject.Inject


class CharacterRepository @Inject constructor (private val serviceApiCharacter: ICharacterApiService){

    fun getCharacterRepository(): Single<List<CharacterDomain>>{
        return serviceApiCharacter.getCharacter()
            .map {
                CharacterMapper(it).character
            }
    }


}