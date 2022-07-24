package com.example.recyclerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val MovieList:List<Movies>): RecyclerView.Adapter<MyAdapter.MyViewholder>() {
    class MyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var MovieName=itemView.findViewById<TextView>(R.id.txtMovieName)
        var MovieActress=itemView.findViewById<TextView>(R.id.txtMovieActress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val inflater:LayoutInflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.item_view,parent,false)
        return MyViewholder(view)


    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        holder.MovieName.text=MovieList[position].MovieName
        holder.MovieActress.text=MovieList[position].MovieActress
    }

    override fun getItemCount(): Int {
        return MovieList.size
    }
}