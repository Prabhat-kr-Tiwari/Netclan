package com.example.netclan.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.netclan.ViewPagerAdapter.ViewPagerAdapter
import com.example.netclan.databinding.FragmentExpolreBinding
import com.google.android.material.tabs.TabLayout


class ExpolreFragment : Fragment() {
    private var binding:FragmentExpolreBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding=FragmentExpolreBinding.inflate(layoutInflater)
            return binding?.root
    }
   /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tabLayout=binding?.tabLayout
        val viewpager=binding?.viewpager
        val viewPagerAdapter:ViewPagerAdapter

        viewPagerAdapter= ViewPagerAdapter(this)
        viewpager?.adapter=viewPagerAdapter
        super.onViewCreated(view, savedInstanceState)
        tabLayout?.addOnTabSelectedListener( object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                if (tab != null) {
                    viewpager?.currentItem=tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }


        }  )
        viewpager?.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout?.getTabAt(position)?.select()
            }
        })



    }
*/
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       val tabLayout = binding?.tabLayout
       val viewPager = binding?.viewpager
       val viewPagerAdapter = ViewPagerAdapter(this)

       viewPager?.adapter = viewPagerAdapter
       tabLayout?.let { tabLayout ->
           if (viewPager != null) {
               viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                   override fun onPageSelected(position: Int) {
                       super.onPageSelected(position)
                       tabLayout.getTabAt(position)?.select()
                   }
               })
           }

           tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
               override fun onTabSelected(tab: TabLayout.Tab?) {
                   tab?.let {
                       if (viewPager != null) {
                           viewPager.currentItem = it.position
                       }
                   }
               }

               override fun onTabUnselected(tab: TabLayout.Tab?) {
                   // Handle unselected tab
               }

               override fun onTabReselected(tab: TabLayout.Tab?) {
                   // Handle tab reselection
                   tab?.let {
                       if (viewPager != null) {
                           viewPager.currentItem = it.position
                       }
                   }

               }
           })

           if (viewPager != null) {
               viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                   override fun onPageSelected(position: Int) {
                       super.onPageSelected(position)
                       tabLayout.getTabAt(position)?.select()
                   }
               })
           }

//           tabLayout.setupWithViewPager(viewPager)
       }
   }


}