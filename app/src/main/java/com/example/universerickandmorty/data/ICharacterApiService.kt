package com.example.universerickandmorty.data

import com.example.universerickandmorty.data.dto.CharacterDto
import com.example.universerickandmorty.data.dto.CharacterRespopnse
import io.reactivex.Single
import retrofit2.http.GET

interface ICharacterApiService {

    @GET("character")
    fun getCharacter(): Single<CharacterRespopnse>

}