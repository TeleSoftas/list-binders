package io.github.telesoftas.listbinders

import kotlin.reflect.KClass

/**
 * LayoutBinder provides ItemBinder logic for a specific layout
 *
 * @param itemLayout layout resource to bind the items to
 * @param viewType item layout resource to bind the items to
 */
abstract class LayoutBinder<T : ListItem>(
    val itemLayout: Int,
    kClass: KClass<T>
) : ItemBinder<T> {
    val viewType: Int = kClass.getViewType()
}

internal fun <T: Any> KClass<T>.getViewType() = simpleName.hashCode()