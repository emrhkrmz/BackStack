package com.kirmizitech.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onBackPressed() {
        //super.onBackPressed()

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

    }

}