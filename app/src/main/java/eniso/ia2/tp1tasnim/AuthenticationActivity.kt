package eniso.ia2.tp1tasnim
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.textfield.TextInputEditText
import java.time.LocalDateTime
import java.util.Date

class AuthenticationActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_authentication)
        var D:TextView=findViewById(R.id.dateText)
        D.text= LocalDateTime.now().toString()

    }

    fun lancer(view: View){
        var L: EditText = findViewById<EditText>(R.id.login)
        var P: EditText = findViewById<EditText>(R.id.password)

        if ( P.text.toString().equals("pwd"+L.text.toString())){
            Toast.makeText(this,"Successfully logged in", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"error ocurred", Toast.LENGTH_LONG).show()
        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun lancer2(view:View){
        var D:TextView=findViewById(R.id.dateText)
        D.text= LocalDateTime.now().toString()

    }


}
