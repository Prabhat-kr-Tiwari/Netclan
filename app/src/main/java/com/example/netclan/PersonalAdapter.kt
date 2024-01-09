package com.example.netclan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.netclan.databinding.ItemBinding
import com.example.netclan.databinding.RvItemBinding
import com.bumptech.glide.Glide

class PersonalAdapter(private val context: Context, private val personalList: List<Personal>) :
    RecyclerView.Adapter<PersonalAdapter.PersonalViewHolder>() {

    /*
     val image:Int,
    val name:String,
    val location:String,
    val profession:String,
    val distance:String,
    val profileCompletionProgress:Int,
    val likes:String,
    val about:String,
    val gender:String,
    val age:Int,
    val netclanId:String,
    val collegename:String,
    val course:String,
    val specilization:String,
    val collegeStart:String,
    val collegeEnd:String,
    val Grades:Double,
    val comapnyName:String,
    val position:String,
    val jobType:String,
    val jobStart:String,
    val jobEnd:String,
    val jobLocation:String,
    val personalemail:String,
    val personalPhone:String,
    val Hobbies:String,
    val movies:String,
    val sports:String,
    val food:String
    */
    inner class PersonalViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

         val image=binding.image
         val name=binding.name
         val location=binding.location
         val profession=binding.profession
         val distance=binding.distanceTxt
         val profileCompletionProgress=binding.profileCompletionProgress
         val likes=binding.likes
         val about=binding.about


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonalAdapter.PersonalViewHolder {
        return PersonalViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PersonalAdapter.PersonalViewHolder, position: Int) {

        /*
          val image=binding.image
        val name=binding.name
        val location=binding.location
        val profession=binding.profession
        val distance=binding.distanceTxt
        val profileCompletionProgress=binding.profileCompletionProgress
        val likes=binding.likes
        val about=binding.about
        */
        val personalModel = personalList[position]
        Glide.with(context).load(personalModel.image).into(holder.image)
        holder.name.text=personalModel.name
        holder.location.text=personalModel.location
        holder.profession.text=personalModel.profession
        holder.distance.text=personalModel.distance
//        holder.profileCompletionProgress.te
        holder.likes.text=personalModel.likes
        holder.about.text=personalModel.about
        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            val intent=Intent(context,PersonalDetailsActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return personalList.size
    }


}