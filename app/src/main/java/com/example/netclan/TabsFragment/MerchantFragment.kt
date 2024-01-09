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
import com.example.netclan.Merchant
import com.example.netclan.MerchantAdapter
import com.example.netclan.Personal
import com.example.netclan.PersonalAdapter
import com.example.netclan.PersonalList
import com.example.netclan.R
import com.example.netclan.databinding.FragmentMerchantBinding
import java.util.Locale


class MerchantFragment : Fragment() {


    private lateinit var binding:FragmentMerchantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMerchantBinding.inflate(layoutInflater)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerview.setHasFixedSize(true)
        binding.recyclerview.adapter = MerchantAdapter(requireContext(), PersonalList.merchantlist)
        binding.etSearchText.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
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
            val filteredList=ArrayList<Merchant>()
            for (i in PersonalList.merchantlist){
                if(i.name.lowercase(Locale.ROOT).contains(newText)){
                    filteredList.add(i)

                }else if(i.location.lowercase(Locale.ROOT).contains(newText)){
                    filteredList.add(i)

                }
            }
            if(filteredList.isEmpty()){
                Toast.makeText(requireContext(),"No Dev Found", Toast.LENGTH_SHORT).show()
            }else{
//              
                binding.recyclerview.adapter = MerchantAdapter(requireContext(),filteredList)
            }

        }
    }



}