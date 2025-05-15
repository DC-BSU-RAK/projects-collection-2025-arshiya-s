package com.example.popupexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow

class MainActivity : AppCompatActivity() {

    private lateinit var showPopupInstruct : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showPopupInstruct = findViewById(R.id.instrucButton)
        showPopupInstruct.setOnClickListener {
            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.popup, null)

            val width = 800
            val height = 500

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.BOTTOM, 20, 100)

            val closeButton = popupView.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }

        }
    }

}