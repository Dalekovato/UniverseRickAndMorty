package com.example.universerickandmorty.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.CharacterInteractorImpl
import com.example.universerickandmorty.domain.model.CharacterDomain
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers.io
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor (private val characterInteractor: CharacterInteractorImpl):ViewModel() {



    private val _char = MutableLiveData<List<CharacterDomain>>()
    val char: LiveData<List<CharacterDomain>>
        get() = _char

    private val dispose = CompositeDisposable()

    fun loadCharacterItem(){
        characterInteractor.getCharacters()
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({char ->
                _char.postValue(char)
            },{
                Log.d("CharacerViewModel", "Error ${char}")
            }).also { dispose.add(it) }
    }


    override fun onCleared() {
        super.onCleared()
        dispose.clear()
    }



}