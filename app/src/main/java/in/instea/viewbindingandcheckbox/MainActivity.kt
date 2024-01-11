package `in`.instea.viewbindingandcheckbox

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import `in`.instea.viewbindingandcheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.btn.setOnClickListener {

            if (binding.checkbox.isChecked) {
                Toast.makeText(this, "Opening...", Toast.LENGTH_SHORT).show()
            } else {
                binding.checkbox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Unchecked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}