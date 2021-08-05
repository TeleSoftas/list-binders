package io.github.telesoftas.sample.multi

import io.github.telesoftas.listbinders.LayoutBinder
import io.github.telesoftas.sample.R
import io.github.telesoftas.sample.multi.PersonListItem.Footer

class FooterBinder : LayoutBinder<Footer>(R.layout.item_multi_footer, Footer::class)
