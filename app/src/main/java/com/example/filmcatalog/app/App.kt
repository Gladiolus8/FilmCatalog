package com.example.filmcatalog.app


import android.app.Application
import com.example.filmcatalog.di.AppComponent
import com.example.filmcatalog.di.AppModule
import com.example.filmcatalog.di.DaggerAppComponent

class App:Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger() {
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()
    }
}