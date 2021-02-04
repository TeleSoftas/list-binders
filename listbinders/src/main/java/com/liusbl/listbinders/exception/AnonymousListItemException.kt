package com.liusbl.listbinders.exception

class AnonymousListItemException : RuntimeException(
    "This should never be an anonymous class. Don't create anonymous ListItem implementations."
)