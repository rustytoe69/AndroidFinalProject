package com.example.finalproject

import com.example.finalproject.databinding.HabitDetailsListItemLayoutBinding
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

//recycler view p3 for HABIT DETAILS FRAG
class HabitDetailsViewHolder(val binding:HabitDetailsListItemLayoutBinding):
RecyclerView.ViewHolder(binding.root){
    private lateinit var currentHabitDetails:HabitDetails

    init{
        binding.dateCheckBox.setOnClickListener { view ->
            currentHabitDetails.isDone=true
        }
    }

    fun bindHabitDetails(habitDetails:HabitDetails){
        currentHabitDetails=habitDetails
        binding.listItemLayoutDateText.text=currentHabitDetails.date
    }
}