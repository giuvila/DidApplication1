package it.polito.did.didapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardViewHolder(var v: View): RecyclerView.ViewHolder(v)  {
    val title: TextView = v.findViewById(R.id.title_not_ev)
    val text: TextView = v.findViewById(R.id.text_not_ev)
}
