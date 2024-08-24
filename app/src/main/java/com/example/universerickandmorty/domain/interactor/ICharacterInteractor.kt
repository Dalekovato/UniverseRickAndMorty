package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.domain.model.CharacterDomain
import dagger.Component
import dagger.Provides
import io.reactivex.Single
import javax.inject.Inject


interface ICharacterInteractor  {

    fun getCharacters(): Single<List<CharacterDomain>>

}