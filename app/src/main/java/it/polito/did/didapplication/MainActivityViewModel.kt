package it.polito.did.didapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import org.json.JSONObject

class ViewModel : ViewModel() {
    var email = ""
    var password = ""
    var name = "Mario"
    var surname = "Rossi"
    var occupation = "Designer"

    init {
        Log.i("VIEWMODEL", "ViewModel created!")
    }
}