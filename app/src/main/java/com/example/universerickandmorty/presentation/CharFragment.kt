package com.example.universerickandmorty.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universerickandmorty.R
import com.example.universerickandmorty.data.ICharacterApiService
import com.example.universerickandmorty.databinding.FragmentCharBinding
import dagger.hilt.android.scopes.FragmentScoped
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create



@FragmentScoped
class CharFragment : Fragment() {
    // Через инжект создать вью мождель , в onViewCreated пишу вью модел . и метод для запуска загрузки создать во вью моделе метод загрузки ,
    private lateinit var binding: FragmentCharBinding
    // в di когда подключаю дагер делаю запрос
    //как через дагер дбавит ретрофит Retrofit 2 & Dagger-Hilt




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