package com.example.universerickandmorty.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers.io

class CharactersViewModel(private val characterInteractor: ICharacterInteractor) : ViewModel() {

    private val _char = MutableLiveData<List<CharacterModel>>()
    val char: LiveData<List<CharacterModel>>
        get() = _char

    private val dispose = CompositeDisposable()

    fun loadCharacterItem(){
        characterInteractor.getCharacters()
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({char ->
                _char.postValue(char)
                Log.d("CharacerViewModel", "Error ${_char}")
            },{
                Log.d("CharacerViewModel", "Error ${char}")
            }).also { dispose.add(it) }

        Log.d("CharacerViewModel", "${char}")

        onCleared()
    }

    override fun onCleared() {
        super.onCleared()
        dispose.clear()
    }
}