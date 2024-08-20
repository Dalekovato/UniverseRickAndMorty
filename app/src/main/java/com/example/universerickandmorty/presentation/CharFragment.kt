package com.example.universerickandmorty.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.universerickandmorty.R
import com.example.universerickandmorty.databinding.FragmentCharBinding

class CharFragment : Fragment() {

    private lateinit var binding: FragmentCharBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCharBinding.inflate(inflater, container, false)
        return binding.root
    }



}