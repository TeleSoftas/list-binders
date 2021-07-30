package com.telesoftas.sample.multi

import android.util.Log
import com.telesoftas.listbinders.BinderViewHolder
import com.telesoftas.listbinders.LayoutBinder
import com.telesoftas.sample.R
import com.telesoftas.sample.multi.PersonListItem.Person
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

    override fun onViewRecycled(viewHolder: BinderViewHolder<Person>) {
        Log.d("TESTING", "Person onViewRecycled")
    }
}