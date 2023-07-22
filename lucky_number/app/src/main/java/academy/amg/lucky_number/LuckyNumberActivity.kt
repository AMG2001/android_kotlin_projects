package academy.amg.lucky_number

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)
        var tv_luckyNumber = findViewById<TextView>(R.id.tv_luckyNumber)
        var btn_share = findViewById<Button>(R.id.btn_share)
        var userName = recieveUsername()

        Toast.makeText(this, "User name : "+userName, Toast.LENGTH_LONG).show()
        var rand = generateRandomNumber()
        tv_luckyNumber.text = rand.toString()
        btn_share.setOnClickListener(){
            shareNumber(userName,rand)
        }
    }

    fun recieveUsername():String{
        var bundle : Bundle? = intent.extras
        var userName : String = bundle?.get("name").toString()
        return userName
    }

    fun generateRandomNumber():Int{
        var rand = Random.nextInt(1000)
        return rand
    }

    fun shareNumber(user_name : String , number : Int){
        var intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_SUBJECT,"$user_name is Lucky today !!")
        intent.putExtra(Intent.EXTRA_TEXT,"lucky number is $number")
        startActivity(intent)
    }
}