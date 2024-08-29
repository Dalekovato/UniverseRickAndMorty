package com.example.universerickandmorty.di

import com.example.universerickandmorty.data.ICharacterApiService
import com.example.universerickandmorty.domain.interactor.ICharacterInteractor
import com.example.universerickandmorty.helper.Constants
import com.example.universerickandmorty.helper.MyAppService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = Constants.BASE_URL


    @Provides
    @Singleton
    fun provideRetrofitInstance(provideBaseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(provideBaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()



    @Provides
    fun provideICharacterApiService(retrofit: Retrofit):ICharacterApiService =
        retrofit.create(ICharacterApiService::class.java)


    @Provides
    fun provideICharacterInteractor(retrofit: Retrofit):ICharacterInteractor =
        retrofit.create(ICharacterInteractor::class.java)



}