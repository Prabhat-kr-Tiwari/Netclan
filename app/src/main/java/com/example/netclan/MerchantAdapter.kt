package com.example.netclan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netclan.databinding.ItemMerchantBinding

class MerchantAdapter(private val context: Context,private val merchantlist: List<Merchant>):RecyclerView.Adapter<MerchantAdapter.MerchantViewHolder>() {


    inner class MerchantViewHolder(private val binding:ItemMerchantBinding):RecyclerView.ViewHolder(binding.root){

        val image=binding.image
        val name=binding.name
        val location=binding.location
        val distance=binding.distanceTxt
        val about=binding.about
        val service=binding.service

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MerchantAdapter.MerchantViewHolder {
        return MerchantViewHolder(ItemMerchantBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MerchantAdapter.MerchantViewHolder, position: Int) {

        val model=merchantlist[position]
        Glide.with(context).load(model.image).into(holder.image)
        holder.name.text=model.name
        holder.location.text=model.location
        holder.distance.text=model.distance
        holder.about.text=model.about
        holder.service.text=model.service
        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            val intent= Intent(context,MerchantDetailsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return merchantlist.size
    }
}