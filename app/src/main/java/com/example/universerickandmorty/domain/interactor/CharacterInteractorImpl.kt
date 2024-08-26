package com.example.universerickandmorty.domain.interactor

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.domain.model.CharacterDomain
import com.example.universerickandmorty.presentation.CharacterModel
import io.reactivex.Single
import javax.inject.Inject

class CharacterInteractorImpl
@Inject constructor(private val characterRepository: CharacterRepository) : ICharacterInteractor{



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