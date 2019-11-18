package com.example.zwm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Set the main text box to be the same text as the button
    fun buttonPress(view: View) {

        val button: Button = view as Button

        findViewById<TextView>(R.id.mainText).text = button.text
    }

    //Make the text box larger if the checkbox is checked
    fun textCheck(view: View) {

        val checkbox: CheckBox = view as CheckBox

        findViewById<TextView>(R.id.mainText).textSize = (if (checkbox.isChecked) 80.toFloat() else 50.toFloat())
    }
}
