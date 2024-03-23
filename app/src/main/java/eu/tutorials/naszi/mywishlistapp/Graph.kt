package eu.tutorials.naszi.mywishlistapp

import android.content.Context
import androidx.room.Room
import eu.tutorials.naszi.mywishlistapp.data.WishDatabase
import eu.tutorials.naszi.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase
    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provider(context: Context) {
        database = Room.databaseBuilder(
            context,
            WishDatabase::class.java,
            "wishlist.db"
        ).build()
    }
}