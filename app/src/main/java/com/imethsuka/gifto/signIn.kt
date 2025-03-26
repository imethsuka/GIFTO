package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signUpPrompt = findViewById<TextView>(R.id.tvSignUp)

        signUpPrompt.setOnClickListener {
            startActivity(Intent(this, signUp::class.java))
            finish() // Optional: closes the sign in activity
        }

        val signInButton = findViewById<Button>(R.id.SignIn)

        signInButton.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
            finish() // Optional: closes the sign in activity
        }
    }
}