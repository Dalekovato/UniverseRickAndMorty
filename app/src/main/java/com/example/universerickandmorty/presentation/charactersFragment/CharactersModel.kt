package com.example.universerickandmorty.presentation.charactersFragment

import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork

data class CharactersModel (

    val imgPhoto: String,
    val tvName:String,
    val tvStatus: StatusImgNetwork,
    val tvSpecies: String

)