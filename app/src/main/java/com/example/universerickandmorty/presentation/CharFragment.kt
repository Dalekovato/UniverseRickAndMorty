package com.example.universerickandmorty.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.universerickandmorty.databinding.FragmentCharBinding
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped

@ActivityScoped
class CharFragment : Fragment() {


    private lateinit var binding: FragmentCharBinding
    private val viewModel : CharactersViewModel by viewModels()
    private lateinit var characterAdapter: CharacterAdapter

    // Через инжект создать вью мождель , в onViewCreated пишу вью модел . и метод для запуска загрузки создать во вью моделе метод загрузки ,


    //как через Dagger-Hilt дбавит Retrofit

    //лайв дата передает данные во фрагмент и во фрагменте подписываюсь на лайф дату . и данные передать в адаптер на отрисовку



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCharBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }




}