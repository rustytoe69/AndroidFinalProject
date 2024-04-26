package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAddHabitBinding
import com.example.finalproject.databinding.FragmentHabitDetailsBinding

class habitDetailsFragment : Fragment() {
    private var _binding: FragmentHabitDetailsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHabitDetailsBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }
}