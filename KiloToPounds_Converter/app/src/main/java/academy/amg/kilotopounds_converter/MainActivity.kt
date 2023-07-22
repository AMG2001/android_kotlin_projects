package academy.amg.kilotopounds_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv_pounds : TextView = findViewById(R.id.textView)
        var et_kilo : EditText = findViewById(R.id.et_kilo)
        var btn_convert : Button = findViewById(R.id.btn_convert)

        btn_convert.setOnClickListener(){
            var kilos : Double = et_kilo.text.toString().toDouble()
            tv_pounds.text = "Pounds : "+convert_kilo_to_pounds(kilos)
        }

    }

    fun convert_kilo_to_pounds(kilo : Double) : Double{
        return  kilo*2.20462
    }
}