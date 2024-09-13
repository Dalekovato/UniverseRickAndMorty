package com.example.universerickandmorty.di

import com.example.universerickandmorty.data.CharactersRepository
import com.example.universerickandmorty.data.ICharactersApiService
import com.example.universerickandmorty.domain.interactor.CharactersInteractorImpl
import com.example.universerickandmorty.domain.interactor.ICharactersInteractor
import com.example.universerickandmorty.presentation.CharactersViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private val networkModule = module {


    single(named(API)) {

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()
    }


    single { get<Retrofit>(named(API)).create(ICharactersApiService::class.java) }

    single {
        CharactersRepository(get())
    }



    factory<ICharactersInteractor> {
        CharactersInteractorImpl(get())
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
private const val BASE_URL = "https://rickandmortyapi.com/api/"

private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()