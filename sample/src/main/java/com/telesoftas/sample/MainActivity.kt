package com.telesoftas.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.telesoftas.sample.multi.MultiActivity
import com.telesoftas.sample.single.SingleActivity
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