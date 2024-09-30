package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.database.CharactersDataBaseRepository
import com.example.universerickandmorty.data.network.CharactersApiRepository
import com.example.universerickandmorty.data.database.dtoDataBase.CharactersEntity
import com.example.universerickandmorty.domain.mapper.dataBase.fromDataBase.CharactersMapperDataBaseFrom
import com.example.universerickandmorty.presentation.charactersFragment.CharactersModel
import io.reactivex.Single

class CharactersInteractorImpl (
    private val characterRepository: CharactersApiRepository ,
    private val charactersDataBase: CharactersDataBaseRepository
) : ICharactersInteractor{

    override fun getCharactersApi(): Single<List<CharactersModel>> {

        val listCharacter: Single<List<CharactersModel>> = characterRepository.getCharactersRepositoryApi()
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

        charactersDataBase.saveCharacterRepositoryDataBase(characterRepository.getCharactersRepositoryApi())

        return listCharacter
    }

    override fun getCharactersDataBase(): Single<List<CharactersEntity>> {
        return charactersDataBase.getCharactersRepositoryDataBase()
    }

}