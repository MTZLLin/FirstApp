package com.myanmarit.firstapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.myanmarit.firstapp.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_view.*

class SharedPreference:AppCompatActivity() {

    val sharedFile = "SHARED_PREFERENCE"
    var sharedPreferences: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)//

        var countViewModel = ViewModelProvider(this).get(CountViewModel::class.java)

        sharedPreferences = this.getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        editor = sharedPreferences!!.edit()
        var storeCount = sharedPreferences?.getInt("COUNT", 0)//set data
        txtVMCount.text = storeCount.toString()

        btnVMCount.setOnClickListener {
            var count = txtVMCount.text.toString().toInt()
            countViewModel.setCount(count)
            txtVMCount.text = countViewModel.getCount().toString()
        }
    }

    override fun onPause() {
        super.onPause()
        editor?.putInt("COUNT", txtVMCount.text.toString().toInt())
        editor?.apply()
        //putInt = add data
    }
}