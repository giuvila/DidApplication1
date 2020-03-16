package it.polito.did.didapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val EMAIL = "EMAIL"
    val PASSWORD = "PASSWORD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_btn.setOnClickListener {
            verifyValue()
        }

    }

    private fun verifyValue(){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(EMAIL, editId.text.toString())
        intent.putExtra(PASSWORD, accediText.text.toString())
        finish()
        startActivity(intent)
    }
}
