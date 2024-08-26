package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.domain.model.CharacterDomain
import com.example.universerickandmorty.presentation.CharSummaryMapper
import com.example.universerickandmorty.presentation.CharacterModel
import io.reactivex.Single
import javax.inject.Inject

class CharacterInteractorImpl
@Inject constructor(private val characterRepository: CharacterRepository) : ICharacterInteractor{


    override fun getCharacters(): Single<List<CharacterDomain>> {
        return characterRepository.getCharactersRepository()
    }





}