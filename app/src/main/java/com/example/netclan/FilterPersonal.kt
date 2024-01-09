package com.example.netclan

import android.widget.Filter
import java.util.Locale

class FilterPersonal(
    private val adapter: PersonalAdapter,
    private val filterPersonals: ArrayList<Personal>
): Filter() {
    override fun performFiltering(searchingText: CharSequence?): FilterResults {

        val filteredResults=FilterResults()
        if(!searchingText.isNullOrEmpty()){
            //filtering
            val query=searchingText.toString().trim().uppercase(Locale.getDefault()).split(" ")
            val filteredPersonalList=ArrayList<Personal>()
            for (personal in filterPersonals){

              /*  if(query.any{search->


                    })*/

            }



        }else{
            filteredResults.apply {
                count=filterPersonals.size
                values=filteredResults
            }
        }
        return filteredResults;

    }

    override fun publishResults(p0: CharSequence?, p1: FilterResults?) {


    }
}