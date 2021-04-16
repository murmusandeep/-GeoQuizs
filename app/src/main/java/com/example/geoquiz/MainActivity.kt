package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val text = R.string.correct_toast
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        falseButton.setOnClickListener { view: View ->
            val text = R.string.incorrect_toast
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this,text,duration)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }
    }




}