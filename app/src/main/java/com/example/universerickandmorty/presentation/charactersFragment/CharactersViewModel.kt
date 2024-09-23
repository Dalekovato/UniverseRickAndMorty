package com.example.universerickandmorty.presentation.charactersFragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.ICharactersInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class CharactersViewModel(
    private val characterInteractor: ICharactersInteractor
) : ViewModel() {

    private val _char = MutableLiveData<List<CharactersModel>>()
    val char: LiveData<List<CharactersModel>> = _char

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