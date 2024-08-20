package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.domain.model.CharacterDomain
import io.reactivex.Single

interface ICharacterInteractor {

    fun getCharacters(): Single<List<CharacterDomain>>

}