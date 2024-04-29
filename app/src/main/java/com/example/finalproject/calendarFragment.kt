package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAddHabitBinding
import com.example.finalproject.databinding.FragmentCalendarBinding
import com.example.finalproject.databinding.FragmentHabitDetailsBinding

class calendarFragment : Fragment() {
    private var _binding: FragmentCalendarBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentCalendarBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }
}