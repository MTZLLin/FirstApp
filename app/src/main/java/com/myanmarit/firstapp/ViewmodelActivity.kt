package com.myanmarit.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.myanmarit.firstapp.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_view.*

class ViewmodelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
    var countViewModel = ViewModelProvider(this).get(CountViewModel::class.java)

        txtVMCount.text =countViewModel.getCount().toString() //0

        btnVMCount.setOnClickListener {
            var count = txtVMCount.text.toString().toInt() //0
            //count++

            countViewModel.setCount(count)
            txtVMCount.text = countViewModel.getCount().toString()
    }
}
}