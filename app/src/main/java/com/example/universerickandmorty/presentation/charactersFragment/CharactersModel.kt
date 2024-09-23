package com.example.universerickandmorty.presentation.charactersFragment

import com.example.universerickandmorty.data.dto.StatusImg

data class CharactersModel (

    val imgPhoto: String,
    val tvName:String ,
    val tvStatus: StatusImg,
    val tvSpecies: String

)