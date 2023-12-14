package eniso.ia2.tp1tasnim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import eniso.ia2.tp1tasnim.R

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)

        val val1 = findViewById<EditText>(R.id.edit_value1)
        val val2 = findViewById<EditText>(R.id.edit_value2)
        val rb1 = findViewById<RadioButton>(R.id.sum)
        val rb2 = findViewById<RadioButton>(R.id.square)
        val calc = findViewById<Button>(R.id.calculateBtn)
        val res = findViewById<TextView>(R.id.result)
        val rg = findViewById<RadioGroup>(R.id.radioGroup)
        val val2text = findViewById<TextView>(R.id.value2text)

        calc.setOnClickListener {
            val value1 = val1.text.toString().toDouble()
            val value2 = val2.text.toString().toDouble()

            if (rb1.isChecked) {
                val result = value1 + value2
                res.text = "$result"
            } else if (rb2.isChecked) {
                val2.visibility = android.view.View.INVISIBLE
                val2text.visibility = android.view.View.INVISIBLE
                val result = value1 * value1
                res.text = "$result"

            }
        }

        rg.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == R.id.sum) {
                val2.visibility = android.view.View.VISIBLE
                val2text.visibility = android.view.View.VISIBLE
                rb2.visibility = android.view.View.VISIBLE
            } else if (checkedId == R.id.square) {
                val2.visibility = android.view.View.INVISIBLE
                val2text.visibility = android.view.View.INVISIBLE
            }
        }

    }
}