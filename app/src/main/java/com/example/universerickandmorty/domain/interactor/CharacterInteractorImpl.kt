package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.domain.model.CharacterDomain
import io.reactivex.Single

class CharacterInteractorImpl (
    private val characterRepository: CharacterRepository
): ICharacterInteractor{




    override fun getCharacters(): Single<List<CharacterDomain>> {
        return characterRepository.getCharacterRepository()
    }



}