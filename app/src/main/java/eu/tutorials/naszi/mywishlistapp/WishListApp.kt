package eu.tutorials.naszi.mywishlistapp

import android.app.Application

class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provider(context = this)
    }
}