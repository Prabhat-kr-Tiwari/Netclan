package com.example.netclan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.netclan.ViewPagerAdapter.BusinessDetailsViewPager
import com.example.netclan.ViewPagerAdapter.MerchantDetailsViewPager
import com.example.netclan.databinding.ActivityBusinessDetailsBinding
import com.example.netclan.databinding.ActivityMerchantDetailsBinding
import com.google.android.material.tabs.TabLayout

class MerchantDetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMerchantDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMerchantDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            finish()
        }


        val MerchantDetailsviewPager = MerchantDetailsViewPager(this)
        val tabLayout=binding.tabLayout
        val viewPager=binding.viewpager
        viewPager.adapter=MerchantDetailsviewPager
        tabLayout.let { tabLayouts ->
            viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    tabLayout.getTabAt(position)?.select()
                }
            })

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