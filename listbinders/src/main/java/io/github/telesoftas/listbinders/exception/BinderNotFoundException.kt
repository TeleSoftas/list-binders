package io.github.telesoftas.listbinders.exception

import io.github.telesoftas.listbinders.LayoutBinder

/**
 * Exception thrown when not all view types are provided
 */
internal class BinderNotFoundException(
    viewType: Int,
    binderList: List<LayoutBinder<*>>
) : RuntimeException(
    "A binder handling view type \"$viewType\" position was not found.\n" +
            "Currently the handled view types are: " +
            "[${binderList.joinToString { it.viewType.toString() }}]"
)