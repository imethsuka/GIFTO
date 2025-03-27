package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class succes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succes)

        // Find the "Go Back Home" button by its ID (changed from button2 to backHome)
        val goBackHomeButton = findViewById<Button>(R.id.backHome)

        // Set click listener using the same pattern as obScreen1
        goBackHomeButton.setOnClickListener {
            // Create intent to navigate to Home activity
            val intent = Intent(this, Home::class.java)

            // Clear the back stack to prevent going back to success page
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK

            // Start the Home activity
            startActivity(intent)

            // Add the same fade animation used in obScreen1
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            // Close the current activity
            finish()
        }
    }
}