package com.myanmarit.firstapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.ViewModelProvider
import com.example.secondapp.viewmodel.ExerciseCountViewModelActivity
import com.myanmarit.firstapp.R
import kotlinx.android.synthetic.main.exercise_view_model.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_view_model)
        var resultViewModel=ViewModelProvider(this).get(ExerciseCountViewModelActivity::class.java)
        var result:Int=0
        if(result !=0) {
            txt_result.setText(resultViewModel.getResult().toString())
        }
        btn_add.setOnClickListener {
            var num1:Int=edit_txt1.text.toString().toInt()
            var num2:Int=edit_txt2.text.toString().toInt()
            result=num1+num2
            resultViewModel.setResult(result)
            txt_result.setText("Result :"+resultViewModel.getResult().toString())

        }
        btn_sub.setOnClickListener {
            var num1:Int=edit_txt1.text.toString().toInt()
            var num2:Int=edit_txt2.text.toString().toInt()
            result=num1-num2
            resultViewModel.setResult(result)
            txt_result.setText("Result :"+resultViewModel.getResult().toString())
        }
        btn_mul.setOnClickListener {
            var num1:Int=edit_txt1.text.toString().toInt()
            var num2:Int=edit_txt2.text.toString().toInt()
            result=num1*num2
            resultViewModel.setResult(result)
            txt_result.setText("Result :"+resultViewModel.getResult().toString())
        }
        btn_div.setOnClickListener {
            var num1:Int=edit_txt1.text.toString().toInt()
            var num2:Int=edit_txt2.text.toString().toInt()
            result=num1/num2
            resultViewModel.setResult(result)
            txt_result.setText("Result :"+resultViewModel.getResult().toString())
        }
    }
}