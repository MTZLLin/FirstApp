package com.myanmarit.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle:>>>>>","Activity start...")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle:>>>>","Activity resume...")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle:>>>>","Activity pause...")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle:>>>>","Activity stop...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifecycle:>>>>","Activity restart...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle:>>>>","Activity destory...")
    }
}