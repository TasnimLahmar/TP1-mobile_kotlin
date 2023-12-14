package eniso.ia2.tp1tasnim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import eniso.ia2.tp1tasnim.ComputeActivity
import eniso.ia2.tp1tasnim.R
import java.text.SimpleDateFormat
import java.util.Date

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val date = findViewById<TextView>(R.id.datetext)
        val date_btn =findViewById<Button>(R.id.datebtn)
        val formatdate = SimpleDateFormat ("dd MMMM yyyy \n HH:mm:ss z")
        val DateAndTime : String = formatdate.format(Date())
        date.text= DateAndTime

        date_btn.setOnClickListener {
            val formatdate = SimpleDateFormat ("dd MMMM yyyy \n HH:mm:ss z")
            val DateAndTime1 : String = formatdate.format(Date())
            date.text= DateAndTime1

        }
        val signin = findViewById<Button>(R.id.signbtn)
        val login : EditText = findViewById(R.id.login)
        val pwd : EditText = findViewById(R.id.password)

        signin.setOnClickListener {
            if(("pw"+login.text.toString()).equals(pwd.text.toString())){
                Toast.makeText(applicationContext, " Logged in successfully !", Toast.LENGTH_LONG).show();
                val monIntent : Intent =  Intent(this, ComputeActivity::class.java)
                startActivity(monIntent)
            }
            else{
                Toast.makeText(applicationContext, " Please enter your correct password", Toast.LENGTH_LONG).show();

            }

        }










    }
}