package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAddHabitBinding

class addHabitFragment : Fragment() {
    private var _binding: FragmentAddHabitBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAddHabitBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }
}