package com.example.universerickandmorty.data

import com.example.universerickandmorty.data.dto.CharacterRespopnse
import io.reactivex.Single
import retrofit2.http.GET

interface ICharactersApiService {

    @GET("character")
    fun getCharacter(): Single<CharacterRespopnse>

}