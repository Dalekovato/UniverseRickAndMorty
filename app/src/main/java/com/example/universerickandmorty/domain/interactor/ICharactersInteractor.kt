package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.presentation.charactersFragment.CharactersModel
import io.reactivex.Single

interface ICharactersInteractor  {


    fun getCharacters(): Single<List<CharactersModel>>



}