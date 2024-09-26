package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.database.CharactersEntity
import com.example.universerickandmorty.presentation.charactersFragment.CharactersModel
import io.reactivex.Single

interface ICharactersInteractor  {


    fun getCharactersApi(): Single<List<CharactersModel>>

    fun getCharactersDataBase(): Single<List<CharactersEntity>>

}