package com.manish.example.compose.androidunittestingdemo.views

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manish.example.compose.androidunittestingdemo.R

class ViewBasedActivity : AppCompatActivity() {

    var testBtn: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_based)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        testBtn = findViewById(R.id.testBtn)
        val tvId: TextView = findViewById(R.id.tvId)
        testBtn?.setOnClickListener {
            buttonClickAction()
            tvId.text = "Button is clicked"
        }
    }

    private fun buttonClickAction() {
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show()
    }
}