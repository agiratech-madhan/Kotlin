package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.calculatorapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addButton.setOnClickListener{
            val inputOne= binding.textInputOne.text.toString().toInt()
            val inputTwo= binding.textInputTwo.text.toString().toInt()
            binding.resultTextVIew.text=(inputOne+inputTwo).toString()

        }

        binding.subButton.setOnClickListener{

            val inputOne= binding.textInputOne.text.toString().toInt()
            val inputTwo= binding.textInputTwo.text.toString().toInt()
            binding.resultTextVIew.text=(inputOne-inputTwo).toString()

        }


        binding.multiplyButton.setOnClickListener{

            val inputOne= binding.textInputOne.text.toString().toInt()
            val inputTwo= binding.textInputTwo.text.toString().toInt()
            binding.resultTextVIew.text=((inputOne )* (inputTwo)).toString()

        }
        binding.divedButton.setOnClickListener{

            val inputOne= binding.textInputOne.text.toString().toInt()
            val inputTwo= binding.textInputTwo.text.toString().toInt()
            binding.resultTextVIew.text=(inputOne/inputTwo).toString()

        }
    }

}