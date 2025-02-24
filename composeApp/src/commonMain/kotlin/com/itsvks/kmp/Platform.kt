package com.itsvks.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform