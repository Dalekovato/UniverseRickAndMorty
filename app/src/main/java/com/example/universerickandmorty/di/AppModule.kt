package com.example.universerickandmorty.di

import com.example.universerickandmorty.helper.Constants
import com.example.universerickandmorty.helper.MyApp
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
    fun provideRetrofitInstance(provideBaseUrl: String): MyApp =
        Retrofit.Builder()
            .baseUrl(provideBaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApp::class.java)


}