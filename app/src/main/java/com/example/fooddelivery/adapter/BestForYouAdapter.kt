package com.example.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.R
import com.example.fooddelivery.databinding.BestforyoulayoutBinding
import com.example.fooddelivery.models.BestForYou

class BestForYouAdapter(val bestForYouList : MutableList<BestForYou>) : RecyclerView.Adapter<BestForYouAdapter.BestHolder>() {

    class BestHolder(var bestforyoulayoutBinding: BestforyoulayoutBinding) :
        RecyclerView.ViewHolder(bestforyoulayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestHolder {
       val bindingView = DataBindingUtil.inflate<BestforyoulayoutBinding>(
           LayoutInflater.from(parent.context),
           R.layout.bestforyoulayout,
           parent,
           false
       )
        return BestHolder(bindingView)
    }

    override fun onBindViewHolder(holder: BestHolder, position: Int) {
      val data = bestForYouList[position]
        holder.bestforyoulayoutBinding.data = data
        holder.bestforyoulayoutBinding.ratingBar.numStars = data.rating?.toInt()!!
    }

    override fun getItemCount(): Int {
       return bestForYouList.size
    }
}