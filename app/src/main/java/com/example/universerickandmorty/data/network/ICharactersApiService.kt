package com.example.universerickandmorty.data.network

import com.example.universerickandmorty.data.network.dtoNetwork.CharacterRespopnseNetwork
import io.reactivex.Single
import retrofit2.http.GET

interface ICharactersApiService {

    @GET("character")
    fun getCharacter(): Single<CharacterRespopnseNetwork>

}