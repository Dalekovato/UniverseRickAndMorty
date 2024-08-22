package com.example.universerickandmorty.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor
import com.example.universerickandmorty.domain.model.CharacterDomain
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers.io

@HiltViewModel
class CharacterViewModel (
    private val characterInteractor: ICharacterInteractor):ViewModel() {

    private val _char = MutableLiveData<CharacterModel>()
    val char: LiveData<CharacterModel> = _char

    private val dispose = CompositeDisposable()

    fun loadCharacterItem(){
        characterInteractor.getCharacters()
            .subscribeOn(io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ char->
                _char.postValue(char)
                //лайв дата передает данные во фрагмент и во фрагменте подписываюсь на лайф дату . и данные передать в адаптер на отрисовку
            },{
                Log.d("CharacerViewModel", "Error ${char}")
            }).also { dispose.add(it) }
    }


    override fun onCleared() {
        super.onCleared()
        dispose.clear()
    }


}