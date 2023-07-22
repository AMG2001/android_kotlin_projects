package academy.amg.lucky_number

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var et_name = findViewById<EditText>(R.id.et_name)
        var btn_generate_lucky_number = findViewById<Button>(R.id.btn_generate_lucky_number)
        btn_generate_lucky_number.setOnClickListener(){
            if(et_name.text.isNotEmpty()){
                var intent = Intent(this,LuckyNumberActivity::class.java)
                intent.putExtra("name",et_name.text)
                startActivity(intent)
            }else
                Toast.makeText(this, "Don't leave name Empty !!", Toast.LENGTH_LONG).show()

        }
    }
}