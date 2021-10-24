package com.grupox.game_primeros_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grupox.game_primeros_test.bd.Clasificacion
import kotlinx.android.synthetic.main.activity_ladderboard.view.*
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var clasificacionList = emptyList<Clasificacion>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return clasificacionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = clasificacionList[position]
        holder.itemView.tv_username.text = currentItem.user
        holder.itemView.tv_puntuacion.text ="Puntuacion: " +currentItem.puntuation
        holder.itemView.tv_tiempo.text = "Tiempo: "+currentItem.parseIntoTime()

    }

    fun setData(clasificacion: List<Clasificacion>){
        this.clasificacionList = clasificacion
        notifyDataSetChanged()
    }
}