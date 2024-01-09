package com.example.netclan.ViewPagerAdapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.netclan.BusinessDetailFragment.OffersFragment
import com.example.netclan.BusinessDetailFragment.ReviewsFragment
import com.example.netclan.MerchantDetailsFragment.AboutFragment

class MerchantDetailsViewPager(activity:AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0->AboutFragment()
            1->OffersFragment()
            2->ReviewsFragment()
            else->AboutFragment()
        }

    }
}