package fr.francoisdabonot.koinannotationsample.android

import android.app.Application
import fr.francoisdabonot.koinannotationsample.startApp
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startApp {
            androidContext(this@MainApplication)
        }
    }
}