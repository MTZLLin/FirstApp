package com.myanmarit.firstapp.viewmodel

import androidx.lifecycle.ViewModel

class CountViewModel:ViewModel() {
    private var count:Int=0 //1
    fun getCount():Int=count   //getter
    //setter //0
    fun setCount(num: Int) :Int{
        count=num
        count+=1 //1
        return count
    }
}