package com.alicelab.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moneyText = findViewById(R.id.moneyText) as TextView
        val peopleText = findViewById(R.id.peopleText) as TextView
        val resultText = findViewById(R.id.resultText) as TextView
        val button = findViewById(R.id.calcButton) as Button
        button.setOnClickListener{
            val money = Integer.parseInt(moneyText.text.toString())
            val people = Integer.parseInt(peopleText.text.toString())

            val result = money / people

            resultText.text = result.toString()
        }
    }
}
