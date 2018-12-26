package com.dashboard.br

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bankCard.setOnClickListener{
            showToast("banking")
        }
        ideaCard.setOnClickListener{
            showToast("ideas")
        }
        addCard.setOnClickListener{
            showToast("add")
        }
        linkCard.setOnClickListener{
            showToast("links")
        }
        connectionCard.setOnClickListener{
            showToast("connection")
        }
    }

    private fun showToast(option: String) {
        Toast.makeText(this, option, Toast.LENGTH_LONG).show()
    }
}
