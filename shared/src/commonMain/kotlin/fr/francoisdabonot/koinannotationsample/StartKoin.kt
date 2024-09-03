package fr.francoisdabonot.koinannotationsample

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.ksp.generated.defaultModule

fun startApp(nativeAppDeclaration: KoinAppDeclaration? = null) {
    startKoin {
        nativeAppDeclaration?.let { it() }
        defaultModule()
    }
}