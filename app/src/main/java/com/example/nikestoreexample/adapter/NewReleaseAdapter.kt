package com.example.nikestoreexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nikestoreexample.R
import com.example.nikestoreexample.model.NewRelease

class NewReleaseAdapter(private val newReleaseList: ArrayList<NewRelease>) :
    RecyclerView.Adapter<NewReleaseAdapter.NewReleaseViewHolder>() {


    class NewReleaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image_shoe)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvGender: TextView = itemView.findViewById(R.id.tvGender)
        val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewReleaseViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.new_release_item, parent, false)
        return NewReleaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewReleaseViewHolder, position: Int) {
        val shoe = newReleaseList[position]
        holder.image.setImageResource(shoe.image)
        holder.tvName.text = shoe.name
        holder.tvGender.text = shoe.gender
        holder.tvPrice.text = shoe.price
        Glide.with(holder.itemView)
            .load(newReleaseList[position].image)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return newReleaseList.size
    }


}