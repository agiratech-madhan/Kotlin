package com.example.realcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realcalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       var editingTexts :String=""
        var resultText= binding.ResultText.text
        var editing=resultText.toString()
         var operator: String = ""
//        var operatorClicked: Boolean = false
        var onResultClicked: Boolean = false
//  var str:String
        binding.one.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false
                val  str6=    editing.plus("1")
                println(str6)
                binding.ResultText.text=str6.toString()

            }else{
                val  str6=    editing.plus("1")
                println(str6)
                binding.ResultText.text=str6.toString()
            }


        }
        binding.two.setOnClickListener {

            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }

                onResultClicked=false

                val str8 = binding.ResultText.text.toString().plus("2")



                binding.ResultText.text = str8.toString()
            }else {

                val str8 = binding.ResultText.text.toString().plus("2")



                binding.ResultText.text = str8.toString()
            }
        }
        binding.three.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str=   binding.ResultText.text.toString().plus("3")

                binding.ResultText.text=str.toString()

            }else{
           val str=   binding.ResultText.text.toString().plus("3")

            binding.ResultText.text=str.toString()
}
        }
        binding.four.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str = binding.ResultText.text.toString().plus("4")

                binding.ResultText.text = str.toString()

            }else {
                val str = binding.ResultText.text.toString().plus("4")

                binding.ResultText.text = str.toString()
            }
        }
        binding.five.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str = binding.ResultText.text.toString().plus("5")
                print(str)

                binding.ResultText.text = str.toString()

            }else {

                val str = binding.ResultText.text.toString().plus("5")
                print(str)

                binding.ResultText.text = str.toString()
            }
        }
        binding.six.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str = binding.ResultText.text.toString().plus("6")
                print(str)

                binding.ResultText.text = str.toString()
            }else {

                val str = binding.ResultText.text.toString().plus("6")
                print(str)

                binding.ResultText.text = str.toString()
            }
        }
        binding.seven.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str = binding.ResultText.text.toString().plus("7")
                print(str)

                binding.ResultText.text = str.toString()
            }else {
                val str = binding.ResultText.text.toString().plus("7")
                print(str)

                binding.ResultText.text = str.toString()
            }
        }
        binding.eight.setOnClickListener {
            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                val str = binding.ResultText.text.toString().plus("8")
                print(str)


                binding.ResultText.text = str.toString()

            }else {
                val str = binding.ResultText.text.toString().plus("8")
                print(str)


                binding.ResultText.text = str.toString()
            }
        }
        binding.nine.setOnClickListener {

            if(                onResultClicked
            ){ if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                binding.ResultText.text=""

            }
                onResultClicked=false

                val  str=     binding.ResultText.text.toString().plus("9")
                print(str)

                binding.ResultText.text=str.toString()

            }else{
            val  str=     binding.ResultText.text.toString().plus("9")
            print(str)

            binding.ResultText.text=str.toString()}

        }
        binding.zero.setOnClickListener {

            if(                onResultClicked
            ){
                if(binding.ResultText.text.toString().matches(Regex(".*\\d$"))){
                    binding.ResultText.text=""

                }
                onResultClicked=false

                var str = binding.ResultText.text.toString().plus("0")
                binding.ResultText.text = str.toString()

            }else {
                var str = binding.ResultText.text.toString().plus("0")
                binding.ResultText.text = str.toString()

            }
        }
        binding.dot.setOnClickListener {
            if(                onResultClicked
            ){
                binding.ResultText.text=""
                onResultClicked=false

                var str = binding.ResultText.text.toString().plus(".")
                binding.ResultText.text = str.toString()

            }else {
                var str = binding.ResultText.text.toString().plus(".")
                binding.ResultText.text = str.toString()

            }
        }
        binding.add.setOnClickListener {
            val operator="+"
            val str1=binding.ResultText.text.toString()
            if(str1.matches(Regex(".*\\d$"))){
                binding.ResultText.text= binding.ResultText.text.toString().plus(operator)

            }

        }
        binding.subtract.setOnClickListener {

            val str1=binding.ResultText.text.toString()
            onResultClicked=false
            if(str1.matches(Regex(".*\\d$"))){
                var str= this.binding.ResultText.text.toString().plus("-")

                binding.ResultText.text= str

            }


        }
        binding.multiply.setOnClickListener {

            val  operator="*"
            val str1=binding.ResultText.text.toString().toString()
            if(str1.matches(Regex(".*\\d$"))){
                binding.ResultText.text= binding.ResultText.text.toString().plus(operator)

            }
        }
        binding.divider.setOnClickListener {

            val  operator="/"
            val str1=binding.ResultText.text.toString().toString()
            if(str1.matches(Regex(".*\\d$"))){
                binding.ResultText.text= binding.ResultText.text.toString().plus(operator)

            }

        }
        binding.allClear.setOnClickListener {
            binding.ResultText.text=""
            onResultClicked=false
        }
        binding.removeLast.setOnClickListener {
            var text=binding.ResultText.text.toString().dropLast(1)
            binding.ResultText.text=text
        }

        binding.calculate.setOnClickListener {
            val result=binding.ResultText.text.toString()
if(binding.ResultText.text.toString().isEmpty()==false){
    if(result.matches(Regex(".*\\d$"))){
        val res=  ExpressionBuilder(result).build().evaluate()
        binding.ResultText.text=res.toString()
        onResultClicked=true            }
    else{

    }
}



        }

    }
}