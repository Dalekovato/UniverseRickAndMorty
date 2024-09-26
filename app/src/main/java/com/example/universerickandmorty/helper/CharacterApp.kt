package com.example.universerickandmorty.helper

import android.app.Application
import com.example.universerickandmorty.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CharacterApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE) // Глянь уровни логирования , что покавзывают PrintLogger(Level. ... )
            androidContext(this@CharacterApp)
            modules(appModules)
        }
    }
}