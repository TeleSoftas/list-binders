package com.liusbl.listbinderssample.multi

import android.util.Log
import com.liusbl.listbinders.BinderViewHolder
import com.liusbl.listbinders.LayoutBinder
import com.liusbl.listbinderssample.R
import com.liusbl.listbinderssample.multi.PersonListItem.Person
import kotlinx.android.synthetic.main.item_multi_person.*

class PersonBinder : LayoutBinder<Person>(R.layout.item_multi_person, Person::class) {
    override fun onBind(
        viewHolder: BinderViewHolder<Person>,
        item: Person
    ) {
        viewHolder.nameTextView.alpha = 0f
        viewHolder.nameTextView.animate()
            .apply { duration = 500 }
            .alpha(1f)
            .start()
        viewHolder.nameTextView.text = item.name
    }

    override fun onViewAttachedToWindow(viewHolder: BinderViewHolder<Person>) {
        Log.d("TESTING", "Person onViewAttachedToWindow")
    }

    override fun onViewDetachedFromWindow(viewHolder: BinderViewHolder<Person>) {
        Log.d("TESTING", "Person onViewDetachedFromWindow")
    }
}