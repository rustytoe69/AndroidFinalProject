package com.example.finalproject
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.HabitDetailsListItemLayoutBinding

class HabitDetailsAdapter(val habitDetailsList:List<HabitDetails>):
    RecyclerView.Adapter<HabitDetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitDetailsViewHolder {
        val binding = HabitDetailsListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return HabitDetailsViewHolder(binding)
    }
    override fun onBindViewHolder(holder: HabitDetailsViewHolder, position: Int) {
        val currentHabitDetails = habitDetailsList[position]
        holder.bindHabitDetails(currentHabitDetails)
    }

    override fun getItemCount(): Int {
        return habitDetailsList.size
    }
}