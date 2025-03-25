package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Sign Up Button -> Navigate to Sign In
        findViewById<Button>(R.id.SignUpButton).setOnClickListener {
            startActivity(Intent(this, signIn::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        // "Don't have an Account? Sign In" Text -> Navigate to Sign In
        findViewById<TextView>(R.id.SignInPrompt).setOnClickListener {
            startActivity(Intent(this, signIn::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}