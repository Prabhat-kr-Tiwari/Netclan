package com.example.netclan.ViewPagerAdapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.netclan.TabsFragment.AboutFragment
import com.example.netclan.TabsFragment.ActivitiesFragment

class PersonalDetailsViewPager(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2;
    }

    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0-> AboutFragment()
            1-> ActivitiesFragment()
            else->AboutFragment()
        }
    }
}