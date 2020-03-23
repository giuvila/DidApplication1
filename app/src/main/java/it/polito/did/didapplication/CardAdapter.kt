package it.polito.did.didapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(val l: List<Card>) : RecyclerView.Adapter<CardViewHolder>(){

    //crea un viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.not_eve_layout, parent, false)
        return CardViewHolder(v)
    }

    //il viewholder viene popolato con i dati
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val p = l.get(position);
        holder.title.text = p.title
        holder.text.text = p.text
    }

    override fun getItemCount(): Int {
        return l.size //torna il size della lista
    }

}