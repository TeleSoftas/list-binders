package com.liusbl.listbinderssample.multi

import com.liusbl.listbinders.LayoutBinder
import com.liusbl.listbinderssample.R
import com.liusbl.listbinderssample.multi.PersonListItem.Footer

class FooterBinder : LayoutBinder<Footer>(R.layout.item_multi_footer, Footer::class)
