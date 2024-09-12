package com.example.universerickandmorty.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class CharactersViewModel(
    private val characterInteractor: ICharacterInteractor
) : ViewModel() {

    private val _char = MutableLiveData<List<CharacterModel>>()
    val char: LiveData<List<CharacterModel>> = _char

    private val dispose = CompositeDisposable()

    fun loadCharacterItem(){
        characterInteractor.getCharacters()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _char.postValue(it)
            },{
                Log.d("CharacterViewModel","ERORORORORORO")
            }).also { dispose.add(it) }
        
    }

    override fun onCleared() {
        super.onCleared()
        dispose.clear()
    }
}