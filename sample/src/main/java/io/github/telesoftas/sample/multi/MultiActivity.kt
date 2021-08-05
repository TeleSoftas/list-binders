package io.github.telesoftas.sample.multi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.telesoftas.listbinders.MultiViewTypeAdapter
import io.github.telesoftas.sample.R
import kotlinx.android.synthetic.main.activity_multi.*

class MultiActivity : AppCompatActivity(), io.github.telesoftas.sample.multi.MultiView {
    private val adapter by lazy { PersonAdapter() }
    private val presenter by lazy { io.github.telesoftas.sample.multi.MultiPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi)
        personRecyclerView.adapter = adapter
        presenter.onViewCreated()
    }

    override fun setPersonList(list: List<io.github.telesoftas.sample.multi.PersonListItem>) {
        adapter.setItems(list)
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, io.github.telesoftas.sample.multi.MultiActivity::class.java)
    }

    private inner class PersonAdapter : MultiViewTypeAdapter<io.github.telesoftas.sample.multi.PersonListItem>(
        listOf(
            io.github.telesoftas.sample.multi.PersonBinder(),
            io.github.telesoftas.sample.multi.HeaderBinder(),
            io.github.telesoftas.sample.multi.FooterBinder()
        )
    )
}