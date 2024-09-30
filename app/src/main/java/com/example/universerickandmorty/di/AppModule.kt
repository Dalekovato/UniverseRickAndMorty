package com.example.universerickandmorty.di

import com.example.universerickandmorty.data.network.CharactersApiRepository
import com.example.universerickandmorty.data.database.CharactersDataBase
import com.example.universerickandmorty.data.database.CharactersDataBaseRepository
import com.example.universerickandmorty.data.network.ICharactersApiService
import com.example.universerickandmorty.domain.interactor.CharactersInteractorImpl
import com.example.universerickandmorty.domain.interactor.ICharactersInteractor
import com.example.universerickandmorty.presentation.charactersFragment.CharactersViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.sin

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
        CharactersApiRepository(get())
    }

}

private val dataModule = module {

    single(named (DATA_BASE)) {
        CharactersDataBase
            .getInstance(androidApplication())
    }

    single (createdAtStart = false){get<CharactersDataBase>(named(DATA_BASE)).charactersDao()}

    single {
        CharactersDataBaseRepository(get ())
    }

}

private val compositeModule = module {

//    single {
//        CharactersApiRepository(get())
//    }
//    single {
//        CharactersDataBaseRepository(get())
//    }

    single {
        CharactersInteractorImpl(get(),get())
    }

    factory<ICharactersInteractor> {
        CharactersInteractorImpl(get(),get())
    }

}



private val viewModel = module {

    viewModel { CharactersViewModel(get()) }
}

val appModules = listOf(
    networkModule,
    dataModule,
    compositeModule,
    viewModel
)



private const val API = "API"
private const val DATA_BASE = "DATA_BASE"
private const val BASE_URL = "https://rickandmortyapi.com/api/"

private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()