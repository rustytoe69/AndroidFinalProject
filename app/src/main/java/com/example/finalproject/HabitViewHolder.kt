package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.MainListItemLayoutBinding

//recycler view for MAIN FRAG

class HabitViewHolder (val binding: MainListItemLayoutBinding):
    RecyclerView.ViewHolder(binding.root){
    private lateinit var currentHabit:Habit

    init{
        binding.habitBlock.setOnClickListener { view ->
            //NAVIGATE TO HABIT DETAILS
        }
    }
    fun bindHabit(habit:Habit){
        currentHabit=habit
        binding.habitBlock.text=currentHabit.name
    }
}