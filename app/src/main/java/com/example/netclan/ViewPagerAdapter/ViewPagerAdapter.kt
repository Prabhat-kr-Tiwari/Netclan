package com.example.netclan.ViewPagerAdapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.netclan.TabsFragment.BusinessFragment
import com.example.netclan.TabsFragment.MerchantFragment
import com.example.netclan.TabsFragment.PersonalFragment
import com.example.netclan.fragment.ExpolreFragment

public class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
       return 3;
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> PersonalFragment()
            1-> BusinessFragment()
            2-> MerchantFragment()
            else-> PersonalFragment()
        }

    }

}