package com.example.cse225_lecture_codes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class EditTextProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_progress)


        val txtView=findViewById<TextView>(R.id.textView)
        val textInput=findViewById<EditText>(R.id.editTextInput)
        val textProgressBar=findViewById<ProgressBar>(R.id.txtProgressBar)
        txtView.text=0.toString()+" / "+textProgressBar.max
        textInput.addTextChangedListener {

            textProgressBar.progress=textInput.text.length
            txtView.text=textInput.text.length.toString()+" / "+textProgressBar.max

        }



    }
}