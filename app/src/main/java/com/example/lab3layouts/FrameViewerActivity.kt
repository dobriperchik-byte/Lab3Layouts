package com.example.lab3layouts

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FrameViewerActivity : AppCompatActivity() {

    // Системные иконки-картинки для переключения по кругу
    private val images = arrayOf(
        android.R.drawable.ic_menu_gallery,
        android.R.drawable.ic_menu_camera,
        android.R.drawable.ic_menu_compass,
        android.R.drawable.ic_menu_mapmode
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_viewer)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnNext = findViewById<ImageButton>(R.id.btnNextImage)

        btnNext.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            imageView.setImageResource(images[currentIndex])
        }
    }
}