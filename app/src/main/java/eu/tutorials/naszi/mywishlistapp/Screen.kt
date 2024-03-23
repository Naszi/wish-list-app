package eu.tutorials.naszi.mywishlistapp

sealed class Screen(val route: String) {
    object HomeScreen: Screen(route = "home_screen")
    object AddScreen: Screen(route = "add_screen")
}