package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentAddHabitBinding
import com.example.finalproject.databinding.FragmentHabitNotesBinding

class habitNotesFragment : Fragment() {
    private var _binding: FragmentHabitNotesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHabitNotesBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }
}