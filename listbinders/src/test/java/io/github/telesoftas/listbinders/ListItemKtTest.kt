package io.github.telesoftas.listbinders

import io.github.telesoftas.listbinders.ListItemKtTest.SomeListItem.*
import io.github.telesoftas.listbinders.exception.AnonymousListItemException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@DisplayName("ListItem")
class ListItemKtTest {
    @Test
    @DisplayName("Correct stableIds are generated")
    fun `generate correct stableIds`() {
        val list = listOf(
            SomeData("DATA_1"),
            SomeNull(null),
            SomeClass("CLASS_1"),
            SomeNull(null),
            SomeClass("CLASS_2"),
            SomeObject,
            SomeData("DATA_2"),
            SomeObject,
            SomeData("DATA_3")
        )
        val actual = list.adjustIds().map { it.stableId }

        val expected = listOf(
            -877735358L,
            358966505L,
            321462730L,
            358966507L,
            321462731L,
            -314047691L,
            -877735357L,
            -314047691L,
            -877735356L
        )
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("AnonymousListItemException is thrown when anonymous ListItem is created")
    fun `throw Exception when anonymous ListItem is created`() {
        assertThrows<AnonymousListItemException> {
            object : ListItem("anything") {}
        }
    }

    private sealed class SomeListItem(id: String?) : ListItem(id) {
        data class SomeData(val id: String) : SomeListItem(id)

        class SomeClass(id: String) : SomeListItem(id)

        data class SomeNull(val id: String?) : SomeListItem(id)

        object SomeObject : SomeListItem(null)
    }
}