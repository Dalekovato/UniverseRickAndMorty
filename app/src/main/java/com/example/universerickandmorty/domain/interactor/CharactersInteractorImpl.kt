package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.CharactersRepository
import com.example.universerickandmorty.data.database.CharactersEntity
import com.example.universerickandmorty.presentation.charactersFragment.CharactersModel
import io.reactivex.Single

class CharactersInteractorImpl (
    private val characterRepository: CharactersRepository
) : ICharactersInteractor{

    override fun getCharactersApi(): Single<List<CharactersModel>> {
        return characterRepository.getCharactersRepositoryApi()
            .map{
                it.map { characterDomain->
                    CharactersModel(
                        imgPhoto = characterDomain.image ,
                        tvName = characterDomain.name,
                        tvStatus = characterDomain.status,
                        tvSpecies = characterDomain.species
                    )

                }
            }
    }

    override fun getCharactersDataBase(): Single<List<CharactersEntity>> {
        TODO("Not yet implemented")
    }

}