package com.example.netclan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netclan.databinding.ItemBusinessBinding

class BusinessAdapter(private val context: Context, private val businessList: List<Business>) :
    RecyclerView.Adapter<BusinessAdapter.BusinessViewHolder>() {


    inner class BusinessViewHolder(private val binding: ItemBusinessBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val image = binding.image
        val name = binding.name
        val location = binding.location
        val distance = binding.distanceTxt
        val position = binding.position
       // val yearsOfExperienceString = binding.yearOfExperience
        val about = binding.about

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BusinessAdapter.BusinessViewHolder {
        return BusinessViewHolder(
            ItemBusinessBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BusinessAdapter.BusinessViewHolder, position: Int) {
        val businessmodel = businessList[position]
        Glide.with(context).load(businessmodel.image).into(holder.image)
        holder.name.text = businessmodel.name
        holder.location.text = businessmodel.location
        holder.distance.text = businessmodel.distance
        holder.position.text = businessmodel.position
       // holder.yearsOfExperienceString.text = businessmodel.yearsOfExperienceString.toString()
        holder.about.text = businessmodel.about
        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            val intent= Intent(context,BusinessDetailsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return businessList.size
    }
}