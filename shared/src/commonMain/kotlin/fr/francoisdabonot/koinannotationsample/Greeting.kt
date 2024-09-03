package fr.francoisdabonot.koinannotationsample

import org.koin.core.annotation.Factory

@Factory
class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}