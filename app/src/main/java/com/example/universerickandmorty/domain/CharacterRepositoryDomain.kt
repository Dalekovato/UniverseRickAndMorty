package com.example.universerickandmorty.domain

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.presentation.CharacterModel
import com.example.universerickandmorty.presentation.CharacterSummaryMapper
import io.reactivex.Single
import javax.inject.Inject

class CharacterRepositoryDomain @Inject constructor(private val characterRepository: CharacterRepository) {

    fun getCharacterRepository(): Single<List<CharacterModel>> {
        return characterRepository.getCharactersRepository()
            .map {
                CharacterSummaryMapper(it).characterShortInf
            }
    }

}