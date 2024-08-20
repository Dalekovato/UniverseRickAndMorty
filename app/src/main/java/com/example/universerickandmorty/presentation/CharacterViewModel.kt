package com.example.universerickandmorty.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor

class CharacterViewModel(
    private val characterInteractor: ICharacterInteractor
):ViewModel() {

    private val _char = MutableLiveData<CharacterModel>()
    val char: LiveData<CharacterModel> = _char


}