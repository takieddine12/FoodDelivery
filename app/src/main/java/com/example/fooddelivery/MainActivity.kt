package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.adapter.BestForYouAdapter
import com.example.fooddelivery.databinding.ActivityMainBinding
import com.example.fooddelivery.databinding.BestforyoulayoutBinding
import com.example.fooddelivery.models.BestForYou

class MainActivity : AppCompatActivity() {
    private lateinit var bestForYouAdapter: BestForYouAdapter
    private lateinit var mutableList: MutableList<BestForYou>
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecycler()


    }

    private fun createRecycler(){

        mutableList = mutableListOf()

        mutableList.add(BestForYou("Pasta",5.0,"15 Min","4.50$"))
        mutableList.add(BestForYou("Chicken",7.5,"19 Min","5.50$"))
        mutableList.add(BestForYou("Beef",5.2,"25 Min","8.50$"))
        mutableList.add(BestForYou("Chackchoka",8.1,"5 Min","6.50$"))
        mutableList.add(BestForYou("Couscous",2.8,"55 Min","4.50$"))
        mutableList.add(BestForYou("Tajine",1.5,"45 Min","7.50$"))
        mutableList.add(BestForYou("Lamb",7.5,"35 Min","15.50$"))
        mutableList.add(BestForYou("Pizza",4.2,"75 Min","24.50$"))
        mutableList.add(BestForYou("Carrot",8.3,"5 Min","9.50$"))
        mutableList.add(BestForYou("Burger",3.8,"10 Min","10.50$"))
        binding.horizontalRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.horizontalRecycler.setHasFixedSize(true)

        bestForYouAdapter = BestForYouAdapter(bestForYouList = mutableList)
        binding.horizontalRecycler.adapter = bestForYouAdapter

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}