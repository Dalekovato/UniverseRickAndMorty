package com.example.universerickandmorty.helper

import android.app.Application
import com.example.universerickandmorty.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CharacterApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CharacterApp)
            modules(appModules)
        }
    }
}