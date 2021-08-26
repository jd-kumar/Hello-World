package com.example.hello_world

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timesClicked=0
            button.setOnClickListener{
            timesClicked+=1
                textView.text=timesClicked.toString()
        }
    }
}