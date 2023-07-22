package academy.amg.print_name

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_print_name : Button = findViewById<Button>(R.id.btn_print_name)
        var et : EditText = findViewById(R.id.et_name)
        btn_print_name.setOnClickListener(){
            Toast.makeText(applicationContext, "Hello , "+et.text, Toast.LENGTH_LONG).show()
        }
    }
}