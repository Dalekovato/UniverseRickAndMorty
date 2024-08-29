package com.example.universerickandmorty.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universerickandmorty.databinding.FragmentCharBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped

@AndroidEntryPoint
class CharFragment : Fragment() {

    private lateinit var binding: FragmentCharBinding
    private val viewModel: CharactersViewModel by viewModels()
    private lateinit var characterAdapter: CharacterAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCharBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()



        viewModel.char.observe(viewLifecycleOwner) {
            characterAdapter.submitList(it)
        }

    }

    private fun init() = with(binding) {
        characterAdapter = CharacterAdapter()
        rcChar.layoutManager = LinearLayoutManager(activity)
        rcChar.adapter = characterAdapter

    }

}

