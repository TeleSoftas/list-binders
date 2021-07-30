package com.telesoftas.listbinderssample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.telesoftas.listbinderssample.multi.MultiActivity
import com.telesoftas.listbinderssample.single.SingleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singleViewTypeExampleButton.setOnClickListener {
            val intent = SingleActivity.createIntent(this@MainActivity)
            startActivity(intent)
        }
        multiViewTypeExampleButton.setOnClickListener {
            val intent = MultiActivity.createIntent(this@MainActivity)
            startActivity(intent)
        }
    }
}