package com.liusbl.listbinders

import com.liusbl.listbinders.exception.AnonymousListItemException

/**
 * All single view type list items must extend this class to provide stable ids.
 *
 * @param id unique item identifier
 * @param viewType Enum that is associated with the list item view type
 */
open class ListItem(private val id: String?) {
    private val viewType = this::class.simpleName ?: throw AnonymousListItemException()
    private var adjustedId: String? = null

    /**
     * Created to prevent public `id` mutability
     */
    val stableId get() = (adjustedId ?: id).hashCode().toLong()

    fun adjustId(index: Int): ListItem {
        if (adjustedId == null) {
            adjustedId = if (id == null) {
                createIdFromIndex(viewType, index)
            } else {
                createIdFromViewType(viewType)
            }
        }
        return this
    }

    private fun createIdFromIndex(viewType: String, index: Int) =
        "viewType_${viewType}__INDEX_$index"

    /**
     * If the ListItem implementation is an `object`,
     * then it will use the previous id, even though we treat it as a new list item.
     *
     * Therefore, we can just return the previous id,
     * since it will be the same for all "instances" of the `object`
     */
    private fun createIdFromViewType(viewType: String): String {
        val objectClassSignature = "viewType_${viewType}__INDEX_"
        val isObject = id!!.contains(objectClassSignature)
        return if (isObject || adjustedId != null) {
            id
        } else {
            "viewType_${viewType}__ID_${id}"
        }
    }
}

@Suppress("UNCHECKED_CAST")
fun <T : ListItem> List<T>.adjustIds(): List<T> = mapIndexed { index, item ->
    item.adjustId(index) as T
}