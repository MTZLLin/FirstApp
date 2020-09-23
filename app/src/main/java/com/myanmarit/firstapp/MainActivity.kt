package com.myanmarit.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.first_app.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_app)
    button_toast.setOnClickListener {
        Toast.makeText(this,"This is a toast",Toast.LENGTH_LONG).show()
    }
        button2_count.setOnClickListener {
            var count: Int = txt1.text.toString().toInt()
            count += 1
            txt1.text = count.toString()

        }
        button3_random.setOnClickListener {
        var randomNum: Int = (0..100).random()
            txt1.text = randomNum.toString()
        }
    }
}