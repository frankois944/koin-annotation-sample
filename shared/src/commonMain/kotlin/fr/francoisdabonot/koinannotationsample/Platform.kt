package fr.francoisdabonot.koinannotationsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform