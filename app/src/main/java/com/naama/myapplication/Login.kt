package com.naama.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button: Button = findViewById(R.id.testButton)
        button.setOnClickListener { switchActivity() }
    }

    private fun switchActivity() {
        var switch: Intent = Intent(this, MainActivity::class.java)
        startActivity(switch)
    }
}