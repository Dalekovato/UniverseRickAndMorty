package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.presentation.CharacterModel
import io.reactivex.Single

interface ICharacterInteractor  {


    fun getCharacters(): Single<List<CharacterModel>>



}