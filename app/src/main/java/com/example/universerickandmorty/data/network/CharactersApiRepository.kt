package com.example.universerickandmorty.data.network

import com.example.universerickandmorty.domain.mapper.network.CharactersMapperNetwork
import com.example.universerickandmorty.domain.model.CharactersDomain
import io.reactivex.Single

class CharactersApiRepository (
    private val serviceApiCharacter: ICharactersApiService,
) {


    fun getCharactersRepositoryApi(): Single<List<CharactersDomain>> {
        return serviceApiCharacter.getCharacter()
            .map {
                 CharactersMapperNetwork(it.results).character
            }

//        val json1 = "[\n" +
//                "    {\n" +
//                "      \"id\": 1,\n" +
//                "      \"name\": \"Rick Sanchez\",\n" +
//                "      \"status\": \"Alive\",\n" +
//                "      \"species\": \"Human\",\n" +
//                "      \"type\": \"Male\",\n" +
//                "      \"gender\": \"Male\",\n" +
//                "      \"origin\": {\n" +
//                "        \"name\": \"Earth\",\n" +
//                "        \"url\": \"https://rickandmortyapi.com/api/location/1\"\n" +
//                "      },\n" +
//                "      \"location\": {\n" +
//                "        \"name\": \"Earth\",\n" +
//                "        \"url\": \"https://rickandmortyapi.com/api/location/20\"\n" +
//                "      },\n" +
//                "      \"image\": \"https://rickandmortyapi.com/api/character/avatar/1.jpeg\",\n" +
//                "      \"episode\": [\n" +
//                "        \"https://rickandmortyapi.com/api/episode/1\",\n" +
//                "        \"https://rickandmortyapi.com/api/episode/2\",\n" +
//                "        // ...\n" +
//                "      ],\n" +
//                "      \"url\": \"https://rickandmortyapi.com/api/character/1\",\n" +
//                "      \"created\": \"2017-11-04T18:48:46.250Z\"\n" +
//                "    },\n" +
//                "    // ...\n" +
//                "  ]"
//
//
//        val json2 = "[]"
//
//        val mockChar: Array<CharacterDto> = Gson().fromJson(
//            json1 , Array<CharacterDto>::class.java
//        )
//
//        return Single.just(CharacterMapper(mockChar.toList()).character)

    }


}