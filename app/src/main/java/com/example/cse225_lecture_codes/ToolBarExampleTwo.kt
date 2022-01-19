package com.example.cse225_lecture_codes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import kotlin.random.Random

class ToolBarExampleTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_example_two)

        var tb=findViewById<Toolbar>(R.id.tb3)
        setSupportActionBar(tb)

        var btn=findViewById<Button>(R.id.btnLike)
        var tv=findViewById<TextView>(R.id.tv)
        var iv=findViewById<ImageView>(R.id.iv)
        var i=0

        btn.setOnClickListener {
            i=i+1
            tv.setText(i.toString())

            var rnd= Random
            var color=Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256))
            iv.setColorFilter(color)
        }

    }
}