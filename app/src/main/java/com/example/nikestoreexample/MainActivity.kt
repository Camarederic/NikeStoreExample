package com.example.nikestoreexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nikestoreexample.adapter.BestSellerAdapter
import com.example.nikestoreexample.adapter.NewReleaseAdapter
import com.example.nikestoreexample.model.BestSeller
import com.example.nikestoreexample.model.NewRelease

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewNewRelease: RecyclerView
    private lateinit var newReleaseAdapter: NewReleaseAdapter
    private lateinit var newReleaseList: ArrayList<NewRelease>

    private lateinit var recyclerViewBestSeller: RecyclerView
    private lateinit var bestSellerAdapter: BestSellerAdapter
    private lateinit var bestSellerList: ArrayList<BestSeller>

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerViewNewRelease = findViewById(R.id.recyclerViewNewRelease)
        recyclerViewNewRelease.setHasFixedSize(true)
        recyclerViewNewRelease.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerViewBestSeller = findViewById(R.id.recyclerViewBestSeller)
        recyclerViewBestSeller.setHasFixedSize(true)
        recyclerViewBestSeller.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        newReleaseList = ArrayList()
        bestSellerList = ArrayList()

        newReleaseList.add(NewRelease(R.drawable.nike_shoe_1,"AIR ZOOM","Men's Shoe", "₽ 28800"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_2,"AIR MORE","Men's Shoe", "₽ 27720"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_3,"RISE REACT","Men's Shoe", "₽ 28800"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_4,"FLYKNIT TRAINER","Men's Shoe", "₽ 25380"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_5,"ZOOM FLY 4","Men's Shoe", "₽ 25200"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_6,"REACT INFINITY","Men's Shoe", "₽ 24660"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_7,"Air Max 270","Men's Shoe", "₽ 24520"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_8,"REACT INFINITY","Men's Shoe", "₽ 24199"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_9,"Zoom Streak","Men's Shoe", "₽ 23990"))
        newReleaseList.add(NewRelease(R.drawable.nike_shoe_10,"AIR VAPORMAX","Men's Shoe", "₽ 23481"))

        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_1,"AIR KUKINI SE","₽ 20700", "5.0"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_2,"air zoom Pegasus 39","₽ 20100", "4.9"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_3,"AIR MAX EXCEE","₽ 19450", "4.7"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_4,"AIR MAX AP","₽ 19190", "4.7"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_5,"KD TREY 5 X","₽ 18450", "4.6"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_6,"AIR MAX MOTION 2","₽ 18099", "4.6"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_7,"AIR MAX AP","₽ 17900", "4.5"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_8,"REACT METCON","₽ 15500", "4.3"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_9,"AIR TUNED MAX","₽ 14900", "4.3"))
        bestSellerList.add(BestSeller(R.drawable.nike_best_seler_10,"REVOLUTION 6 NN","₽ 13599", "4.1"))

        newReleaseAdapter = NewReleaseAdapter(newReleaseList)
        recyclerViewNewRelease.adapter = newReleaseAdapter
        newReleaseAdapter.notifyDataSetChanged()

        bestSellerAdapter = BestSellerAdapter(bestSellerList)
        recyclerViewBestSeller.adapter = bestSellerAdapter
        bestSellerAdapter.notifyDataSetChanged()


    }
}