package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Find the "Don't have account" text
        val signUpPrompt = findViewById<TextView>(R.id.tvSignUp)

        // Set click listener to navigate to sign up
        signUpPrompt.setOnClickListener {
            startActivity(Intent(this, signUp::class.java))
            finish() // Optional: closes the sign in activity
        }
    }
}