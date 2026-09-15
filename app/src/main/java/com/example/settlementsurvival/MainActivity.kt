package com.example.settlementsurvival

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.View

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View(this)
        view.setBackgroundColor(Color.rgb(80, 130, 80))

        setContentView(view)
    }
}
