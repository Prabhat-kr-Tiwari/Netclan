package com.example.netclan.ViewPagerAdapter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.netclan.BusinessDetailFragment.AboutFragment
import com.example.netclan.BusinessDetailFragment.OffersFragment
import com.example.netclan.BusinessDetailFragment.ReviewsFragment

class BusinessDetailsViewPager(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->AboutFragment()
            1->OffersFragment()
            2->ReviewsFragment()
            else->AboutFragment()
        }

    }
}