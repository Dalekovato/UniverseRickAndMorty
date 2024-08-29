package com.example.universerickandmorty.di

import com.example.universerickandmorty.data.CharacterRepository
import com.example.universerickandmorty.data.ICharacterApiService
import com.example.universerickandmorty.domain.interactor.CharacterInteractorImpl
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor
import com.example.universerickandmorty.helper.Constants
import com.example.universerickandmorty.presentation.CharactersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private val networkModule = module {

    single (named(API)){
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    single { get <Retrofit>(named(API)).create(ICharacterApiService::class.java) }

    single{
        CharacterRepository(get())
    }

    factory <ICharacterInteractor>{
        CharacterInteractorImpl(get())
    }

}

private val viewModel = module {

    viewModel { CharactersViewModel(get()) }
}


val appModules = listOf(
    networkModule,
    viewModel
)






private const val API = "API"