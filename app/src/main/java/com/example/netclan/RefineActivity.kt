package com.example.netclan

import android.R.attr
import android.content.res.ColorStateList
import android.content.res.Resources
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.example.netclan.databinding.ActivityRefineBinding
import com.google.android.material.chip.Chip


class RefineActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            finish()
        }
//        val spinner: Spinner = findViewById(R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout.
     /*   ArrayAdapter.createFromResource(
            this,
            R.array.availability,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears.
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner.
            spinner.adapter = adapter
        }*/
        val availabilityArray = resources.getStringArray(R.array.availability)
        val color = ContextCompat.getColor(this, R.color.netclan_color) // Replace with your desired color resource

        val spinner = findViewById<Spinner>(R.id.spinner)

        val adapter = object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, availabilityArray) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<TextView>(android.R.id.text1)
                textView.setTextColor(color)
                textView.textSize=15F
                return view
            }

            override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getDropDownView(position, convertView, parent)
                val textView = view.findViewById<TextView>(android.R.id.text1)
                textView.setTextColor(color)
                return view
            }
        }

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


        //setting editext limit
//        val editText = findViewById(R.id.edit_text)
        val editext=findViewById<AppCompatEditText>(R.id.edit_text)
        val maxWords = 250 // Set your desired maximum number of words

        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val str=editext.text.toString()
                val num=str.length
                binding.wordCount.setText(""+num)
                Log.d("PRABHAT", "onTextChanged: Size is ${num}")


            }

            override fun afterTextChanged(editable: Editable?) {
                val text = editable.toString().trim()
                val words = text.split("\\s+".toRegex()).size // Split text into words

                val str=editext.text.toString()
                val num=str.length
                Log.d("RABHAT", "afterTextChanged: ${words}")

                val newText = StringBuilder()
                if (num > maxWords) {
                    // If the number of words exceeds the limit, remove excess words
                    val excessWords = text.split("\\s+".toRegex(), maxWords + 1)

                    for (i in 0 until maxWords) {
                        newText.append(excessWords[i]).append(" ")
                    }
                    binding.editText.setText(newText.toString().trim())
                    binding.editText.text?.let { binding.editText.setSelection(it.length) } // Set cursor position to the end
                }
               /* val spaceCount = text.count { it == ' ' }

                if (spaceCount >= maxWords) {
                    // If the number of spaces (words) exceeds the limit, remove the excess characters
                    val newText = text.split("\\s+".toRegex(), (maxWords + 1)).joinToString(" ")
                    editext.setText(newText)
                    editext.text?.let { editext.setSelection(it.length) } // Set cursor position to the end
                }*/


            }
        })

        //handling chip click

        setupChipClickListener(binding.chipCoffee, R.color.netclan_color)
        setupChipClickListener(binding.chipBusiness, R.color.netclan_color)
        setupChipClickListener(binding.chipHobbies, R.color.netclan_color)
        setupChipClickListener(binding.chipFriendship, R.color.netclan_color)
        setupChipClickListener(binding.chipMovies, R.color.netclan_color)
        setupChipClickListener(binding.chipDining, R.color.netclan_color)
        setupChipClickListener(binding.chipDating, R.color.netclan_color)
        setupChipClickListener(binding.chipMatrimony, R.color.netclan_color)




    }
    private fun setChipProperties(chip: Chip, @ColorRes colorRes: Int) {
        try {
            val color = ContextCompat.getColor(this, colorRes)
            chip.isActivated = true
            chip.setChipBackgroundColor(ColorStateList.valueOf(color))
            chip.setTextColor(ContextCompat.getColor(this, R.color.white))
        } catch (e: Resources.NotFoundException) {
            e.printStackTrace()

        }
    }
    private fun setupChipClickListener(chip: Chip, @ColorRes colorRes: Int) {
        chip.setOnClickListener {
            setChipProperties(chip, colorRes)
        }
    }
}