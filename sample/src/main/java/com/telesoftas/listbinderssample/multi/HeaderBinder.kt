package com.telesoftas.listbinderssample.multi

import com.telesoftas.listbinders.BinderViewHolder
import com.telesoftas.listbinders.LayoutBinder
import com.telesoftas.listbinderssample.R
import com.telesoftas.listbinderssample.multi.PersonListItem.Header
import kotlinx.android.synthetic.main.item_multi_header.*

class HeaderBinder : LayoutBinder<Header>(R.layout.item_multi_header, Header::class) {
    override fun onBind(
        viewHolder: BinderViewHolder<Header>,
        item: Header
    ) {
        viewHolder.headerTextView.text = item.title
    }
}