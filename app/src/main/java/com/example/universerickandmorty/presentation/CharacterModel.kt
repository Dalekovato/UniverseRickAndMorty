package com.example.universerickandmorty.presentation

import com.example.universerickandmorty.data.dto.StatusImg

data class CharacterModel (

    val imgPhoto: String,
    val tvName:String ,
    val tvStatus: StatusImg,
    val tvSpecies: String

)