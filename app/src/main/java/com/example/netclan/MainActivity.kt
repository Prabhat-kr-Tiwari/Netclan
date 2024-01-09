package com.example.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import com.example.netclan.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


import androidx.navigation.ui.setupWithNavController



class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.refine.setOnClickListener {

            startActivity(Intent(this,RefineActivity::class.java))
        }

        toolbar=findViewById(R.id.toolbar)
        //step 1
        setSupportActionBar(toolbar)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_bottom_navigation)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
      /*  val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_delivery, R.id.navigation_dining, R.id.navigation_money
            )
        )*/
        /*setupActionBarWithNavController(navController, appBarConfiguration)
        supportActionBar?.hide()*/
        navView.setupWithNavController(navController)
        Log.d("Prabhat", "onCreate: ")







    }
}