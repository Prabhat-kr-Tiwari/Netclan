package com.example.netclan.TabsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.netclan.R
import com.example.netclan.databinding.FragmentActivitiesBinding
import com.example.netclan.databinding.FragmentPersonalBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


class ActivitiesFragment : Fragment() {


    private lateinit var binding:FragmentActivitiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        binding= FragmentActivitiesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val list= listOf<String>(
            "a","b","c"
        )


        //hobbies
        val chip= Chip(requireContext())
        chip.text="Singing"
        chip.textSize=10F
        chip.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        chip.setChipBackgroundColorResource(R.color.netclan_color)

       /* for (i in list){

            chip.text=i
            val chipgroup:ChipGroup= binding.chipGroupMain
            chipgroup.addView(chip)

        }*/

        val chip1= Chip(requireContext())
        chip1.text="Writing"
        chip1.textSize=10F
        chip1.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        chip1.setChipBackgroundColorResource(R.color.netclan_color)


        val chip2= Chip(requireContext())
        chip2.text="Reading"
        chip2.textSize=10F
        chip2.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        chip2.setChipBackgroundColorResource(R.color.netclan_color)


        val chip3= Chip(requireContext())
        chip3.text="Listening to music"
        chip3.textSize=10F
        chip3.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        chip3.setChipBackgroundColorResource(R.color.netclan_color)
        val chipgroup:ChipGroup= binding.chipGroupMain
        chipgroup.addView(chip)
        chipgroup.addView(chip1)
        chipgroup.addView(chip2)
        chipgroup.addView(chip3)


        //movies
        val movieschip= Chip(requireContext())
        movieschip.text="Sitcom"
        movieschip.textSize=10F
        movieschip.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        movieschip.setChipBackgroundColorResource(R.color.netclan_color)


        val movieschipchip1= Chip(requireContext())
        movieschipchip1.text="Science fiction"
        movieschipchip1.textSize=10F
        movieschipchip1.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        movieschipchip1.setChipBackgroundColorResource(R.color.netclan_color)


        val movieschipchip2= Chip(requireContext())
        movieschipchip2.text="Reading"
        movieschipchip2.textSize=10F
        movieschipchip2.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        movieschipchip2.setChipBackgroundColorResource(R.color.netclan_color)


        val movieschipchip3= Chip(requireContext())
        movieschipchip3.text="Listening to music"
        movieschipchip3.textSize=10F
        movieschipchip3.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        movieschipchip3.setChipBackgroundColorResource(R.color.netclan_color)
        val movieschipchipgroup:ChipGroup= binding.chipGroupMovies
        movieschipchipgroup.addView(movieschip)
        movieschipchipgroup.addView(movieschipchip1)
        movieschipchipgroup.addView(movieschipchip2)
        movieschipchipgroup.addView(movieschipchip3)



        //sports
        val sportschip= Chip(requireContext())
        sportschip.text="Singing"
        sportschip.textSize=10F
        sportschip.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        sportschip.setChipBackgroundColorResource(R.color.netclan_color)


        val sportschip1= Chip(requireContext())
        sportschip1.text="Writing"
        sportschip1.textSize=10F
        sportschip1.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        sportschip1.setChipBackgroundColorResource(R.color.netclan_color)


        val sportschip2= Chip(requireContext())
        sportschip2.text="Reading"
        sportschip2.textSize=10F
        sportschip2.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        sportschip2.setChipBackgroundColorResource(R.color.netclan_color)


        val sportschip3= Chip(requireContext())
        sportschip3.text="Listening to music"
        sportschip3.textSize=10F
        sportschip3.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        sportschip3.setChipBackgroundColorResource(R.color.netclan_color)
        val sportschipgroup:ChipGroup= binding.chipGroupSports
        sportschipgroup.addView(sportschip)
        sportschipgroup.addView(sportschip1)
        sportschipgroup.addView(sportschip2)
        sportschipgroup.addView(sportschip3)



        //food
        val foodchip= Chip(requireContext())
        foodchip.text="Singing"
        foodchip.textSize=10F
        foodchip.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        foodchip.setChipBackgroundColorResource(R.color.netclan_color)


        val foodchip1= Chip(requireContext())
        foodchip1.text="Writing"
        foodchip1.textSize=10F
        foodchip1.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        foodchip1.setChipBackgroundColorResource(R.color.netclan_color)


        val foodchip2= Chip(requireContext())
        foodchip2.text="Reading"
        foodchip2.textSize=10F
        foodchip2.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        foodchip2.setChipBackgroundColorResource(R.color.netclan_color)


        val foodchip3= Chip(requireContext())
        foodchip3.text="Listening to music"
        foodchip3.textSize=10F
        foodchip3.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        foodchip3.setChipBackgroundColorResource(R.color.netclan_color)
        val foodchipgroup:ChipGroup= binding.chipGroupFood
        foodchipgroup.addView(foodchip)
        foodchipgroup.addView(foodchip1)
        foodchipgroup.addView(foodchip2)
        foodchipgroup.addView(foodchip3)
    }


}