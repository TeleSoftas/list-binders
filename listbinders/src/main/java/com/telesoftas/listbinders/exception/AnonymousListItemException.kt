package com.telesoftas.listbinders.exception

internal class AnonymousListItemException : RuntimeException(
    "This should never be an anonymous class. Don't create anonymous ListItem implementations."
)