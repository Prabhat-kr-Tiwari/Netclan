package com.example.netclan.TabsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netclan.BusinessAdapter
import com.example.netclan.Personal
import com.example.netclan.PersonalAdapter
import com.example.netclan.PersonalList
import com.example.netclan.R
import com.example.netclan.databinding.FragmentBusinessBinding
import com.example.netclan.databinding.FragmentPersonalBinding
import java.util.Locale


class BusinessFragment : Fragment() {
    private var binding: FragmentBusinessBinding?=null
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        binding= FragmentBusinessBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.recyclerview?.layoutManager= LinearLayoutManager(requireContext())
        binding?.recyclerview?.setHasFixedSize(true)
        binding?.recyclerview?.adapter= BusinessAdapter(requireContext(), PersonalList.busineslist)
        binding?.etSearchText?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })
    }
    private fun filterList(newText: String?) {
        if (newText!=null){
            val filteredList=ArrayList<Personal>()
            for (i in PersonalList.list){
                if(i.name.lowercase(Locale.ROOT).contains(newText)){
                    filteredList.add(i)

                }else if(i.location.lowercase(Locale.ROOT).contains(newText)){
                    filteredList.add(i)

                }
            }
            if(filteredList.isEmpty()){
                Toast.makeText(requireContext(),"No Dev Found", Toast.LENGTH_SHORT).show()
            }else{
//                binding.recyclerView.adapter= CampusConnectAdapter(this,filteredList)
                binding?.recyclerview?.adapter= PersonalAdapter(requireContext(),filteredList)
            }

        }
    }



}