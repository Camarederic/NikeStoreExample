package com.example.nikestoreexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nikestoreexample.adapter.NewReleaseAdapter
import com.example.nikestoreexample.model.NewRelease

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newReleaseAdapter: NewReleaseAdapter
    private lateinit var newReleaseList: ArrayList<NewRelease>

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportActionBar?.setHomeButtonEnabled(true)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_nike)

        recyclerView = findViewById(R.id.recyclerViewNewRelease)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        newReleaseList = ArrayList()

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


        newReleaseAdapter = NewReleaseAdapter(newReleaseList)
        recyclerView.adapter = newReleaseAdapter
        newReleaseAdapter.notifyDataSetChanged()
    }
}