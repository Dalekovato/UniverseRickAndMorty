package com.example.universerickandmorty.data

import com.example.universerickandmorty.data.dto.CharacterDto
import com.example.universerickandmorty.helper.Constants
import io.reactivex.Single
import retrofit2.http.GET

interface ICharacterApiService {

    @GET(Constants.END_POINT)
    fun getCharacter(): Single<List<CharacterDto>>




}