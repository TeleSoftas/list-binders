package io.github.telesoftas.sample.multi

import io.github.telesoftas.listbinders.ListItem

sealed class PersonListItem(id: String?) : ListItem(id) {
    data class Person(
        val id: String,
        val name: String
    ) : PersonListItem(id)

    data class Header(
        val title: String
    ) : PersonListItem(title)

    object Footer : PersonListItem(null)
}