package com.example.universerickandmorty.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universerickandmorty.databinding.FragmentCharBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharFragment : Fragment() {

    private lateinit var binding: FragmentCharBinding
    private val viewModel: CharactersViewModel by viewModel()
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



        with(viewModel) {
            init()
            loadCharacterItem()

            Log.d("ViewModelFragment", "im her")
            char.observe(viewLifecycleOwner) { char ->
                    characterAdapter.submitList(char)
                Log.d("ViewModelFragment", "${char}")
            }
        }
    }

    private fun init() = with(binding) {
        characterAdapter = CharacterAdapter()
        rcChar.layoutManager = LinearLayoutManager(activity)
        rcChar.adapter = characterAdapter

    }

}

