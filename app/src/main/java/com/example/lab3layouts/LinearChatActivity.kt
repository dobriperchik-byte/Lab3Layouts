package com.example.lab3layouts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LinearChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_chat)

        val chatContainer = findViewById<LinearLayout>(R.id.chatContainerLinear)
        val etMessage = findViewById<EditText>(R.id.etMessageLinear)
        val btnSend = findViewById<Button>(R.id.btnSendLinear)
        val scrollView = findViewById<ScrollView>(R.id.scrollViewLinear)

        btnSend.setOnClickListener {
            val text = etMessage.text.toString().trim()
            if (text.isNotEmpty()) {
                val textView = TextView(this).apply {
                    this.text = text
                    textSize = 16f
                    setPadding(16, 12, 16, 12)
                }
                chatContainer.addView(textView)
                etMessage.text.clear()

                scrollView.post { scrollView.fullScroll(ScrollView.FOCUS_DOWN) }
            }
        }
    }
}