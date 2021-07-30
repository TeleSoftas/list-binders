package com.telesoftas.listbinderssample.multi

import com.telesoftas.listbinders.LayoutBinder
import com.telesoftas.listbinderssample.R
import com.telesoftas.listbinderssample.multi.PersonListItem.Footer

class FooterBinder : LayoutBinder<Footer>(R.layout.item_multi_footer, Footer::class)
