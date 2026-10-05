package com.example.lab3layouts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOpenLinearLayout).setOnClickListener {
            startActivity(Intent(this, LinearChatActivity::class.java))
        }

        findViewById<Button>(R.id.btnOpenConstraintLayout).setOnClickListener {
            startActivity(Intent(this, ConstraintChatActivity::class.java))
        }

        findViewById<Button>(R.id.btnOpenFrameLayout).setOnClickListener {
            startActivity(Intent(this, FrameViewerActivity::class.java))
        }
    }
}