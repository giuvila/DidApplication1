package it.polito.did.didapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_btn.setOnClickListener {
            verifyValue()
        }

    }

    private fun verifyValue(){
        val intent = Intent(this, MainActivity :: class.java)
        finish()
        startActivity(intent)
    }
}
