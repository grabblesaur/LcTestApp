package com.example.lctestapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        initViews()
    }

    private fun initViews() {
        showAnotherActivityBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}