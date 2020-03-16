package it.polito.did.didapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    var email = "";
    var password = "";
    init {
        Log.i("VIEWMODEL", "ViewModel created!")
    }
}