package com.treasure.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform