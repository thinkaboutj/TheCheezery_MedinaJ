package medina.jesus.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById<Button>(R.id.button_cold_drinks)
        var btnHot: Button = findViewById<Button>(R.id.button_hot_drinks)
        var btnSweets: Button = findViewById<Button>(R.id.button_sweets)
        var btnSalties: Button = findViewById<Button>(R.id.button_salties)


        //tuve que cambiar todo para implementar los demas xd
        btnCold.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","coldDrinks")
            startActivity(intent)
        }
        btnHot.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","hotDrinks")
            startActivity(intent)
        }
        btnSweets.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","sweets")
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","salties")
            startActivity(intent)
        }
    }
}