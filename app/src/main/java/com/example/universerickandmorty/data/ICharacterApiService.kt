package com.example.universerickandmorty.data

import com.example.universerickandmorty.data.dto.CharacterDto
import io.reactivex.Single
import retrofit2.http.GET

interface ICharacterApiService {

    @GET("api/character")
    fun getCharacter(): Single<List<CharacterDto>>
}