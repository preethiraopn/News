package com.example.news.data

import android.os.Parcelable
import android.util.Log
import kotlinx.android.parcel.Parcelize
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object NewsDummyData {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<NewsItems> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, NewsItems> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: NewsItems) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): NewsItems {
        return NewsItems(position.toString(), "News " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about New: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    @Parcelize
    data class NewsItems(val id: String, var content: String, var details: String) : Parcelable {
        override fun toString(): String = content
    }
}
