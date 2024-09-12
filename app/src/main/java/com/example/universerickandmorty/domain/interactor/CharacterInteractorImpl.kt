package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.presentation.CharacterModel
import io.reactivex.Single

class CharacterInteractorImpl (
    private val characterRepository: CharacterRepository
) : ICharacterInteractor{

    override fun getCharacters(): Single<List<CharacterModel>> {
        return characterRepository.getCharactersRepository()
            .map{
                it.map { characterDomain->
                    CharacterModel(
                        imgPhoto = characterDomain.image ,
                        tvName = characterDomain.name,
                        tvStatus = characterDomain.status,
                        tvSpecies = characterDomain.species
                    )

                }
            }
    }


}