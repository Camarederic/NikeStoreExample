package com.example.nikestoreexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nikestoreexample.R
import com.example.nikestoreexample.model.BestSeller


class BestSellerAdapter (private val bestSellerList: ArrayList<BestSeller>) :
    RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder>() {


    class BestSellerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val image: ImageView = itemView.findViewById(R.id.imageNike)
        val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        val tvRating:TextView = itemView.findViewById(R.id.tvRating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.best_seller_item, parent, false)
        return BestSellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        val shoe = bestSellerList[position]
        holder.image.setImageResource(shoe.image)
        holder.tvName.text = shoe.name
        holder.tvRating.text = shoe.rating
        holder.tvPrice.text = shoe.price
        Glide.with(holder.itemView)
            .load(bestSellerList[position].image)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return bestSellerList.size
    }


}