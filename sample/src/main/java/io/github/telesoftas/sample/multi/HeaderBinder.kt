package io.github.telesoftas.sample.multi

import io.github.telesoftas.listbinders.BinderViewHolder
import io.github.telesoftas.listbinders.LayoutBinder
import io.github.telesoftas.sample.R
import io.github.telesoftas.sample.multi.PersonListItem.Header
import kotlinx.android.synthetic.main.item_multi_header.*

class HeaderBinder : LayoutBinder<Header>(R.layout.item_multi_header, Header::class) {
    override fun onBind(
        viewHolder: BinderViewHolder<Header>,
        item: Header
    ) {
        viewHolder.headerTextView.text = item.title
    }
}