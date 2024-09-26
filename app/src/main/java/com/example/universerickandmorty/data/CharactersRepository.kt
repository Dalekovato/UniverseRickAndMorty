package com.example.universerickandmorty.data

import com.example.universerickandmorty.data.database.CharactersEntity
import com.example.universerickandmorty.data.database.ICharactersDao
import com.example.universerickandmorty.data.network.ICharactersApiService
import com.example.universerickandmorty.domain.mapper.database.CharactersMapperDataBase
import com.example.universerickandmorty.domain.mapper.network.CharactersMapperApi
import com.example.universerickandmorty.domain.model.CharactersDomainApi
import com.example.universerickandmorty.domain.model.CharactersDomainDataBase
import io.reactivex.Single

class CharactersRepository (
    private val serviceApiCharacter: ICharactersApiService,
    private val serviceDataBaseCharacter: ICharactersDao

) {


    fun getCharactersRepositoryApi(): Single<List<CharactersDomainApi>> {
        return serviceApiCharacter.getCharacter()
            .map {
                 CharactersMapperApi(it.results).character
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

    fun getCharactersRepositoryDataBase(): Single<List<CharactersDomainDataBase>> {
        return serviceDataBaseCharacter.loadAllCharacters()
            .map {
                CharactersMapperDataBase(it).character
            }
    }

}