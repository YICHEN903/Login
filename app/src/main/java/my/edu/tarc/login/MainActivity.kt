package my.edu.tarc.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogOut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogOut = findViewById(R.id.btn_logout)

        btnLogOut.setOnClickListener{
            Firebase.auth.signOut()

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}