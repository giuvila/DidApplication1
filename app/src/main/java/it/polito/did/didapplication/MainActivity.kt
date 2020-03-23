package it.polito.did.didapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    val viewModel:ViewModel by lazy {
        ViewModelProvider(this).get(ViewModel::class.java)
    }

    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.email = intent.getStringExtra("EMAIL")
        viewModel.password = intent.getStringExtra("PASSWORD")

        navController = Navigation.findNavController(this, R.id.fragment)
        bttm_nav.setupWithNavController(navController)

    }

}
