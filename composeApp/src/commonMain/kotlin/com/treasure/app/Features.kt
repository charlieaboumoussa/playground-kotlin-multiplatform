package com.treasure.app

sealed class Features(val route: String) {
    class Preonboarding: Features(route = "preonboarding")
    class Authentication: Features(route = "authentication")
    class Landing: Features(route = "landing")
    class Riddle: Features(route = "riddle")
    class Treasure: Features(route = "treasure")
}