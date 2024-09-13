package com.example.universerickandmorty.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universerickandmorty.databinding.FragmentCharBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharactersFragment : Fragment() {

    private lateinit var binding: FragmentCharBinding
    private val viewModel: CharactersViewModel by viewModel()
    private lateinit var characterAdapter: CharactersAdapter

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

        with(viewModel) {

            loadCharacterItem()

            char.observe(viewLifecycleOwner) {
                characterAdapter.submitList(it)
            }
        }
    }

    private fun init() = with(binding) {
        characterAdapter = CharactersAdapter()
        rcChar.layoutManager = LinearLayoutManager(activity)
        rcChar.adapter = characterAdapter
    }

}

