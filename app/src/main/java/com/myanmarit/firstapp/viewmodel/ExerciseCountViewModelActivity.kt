package com.example.secondapp.viewmodel

import androidx.lifecycle.ViewModel

class ExerciseCountViewModelActivity :ViewModel(){
    private var count:Int=0
    private var result:Int=0
    fun getCount():Int=count
    fun setCount(num: Int) :Int{
        count=num
        count++
        return count

    }
    fun getResult():Int=result
    fun setResult(ret:Int):Int{
        result=ret
        return result
    }

}