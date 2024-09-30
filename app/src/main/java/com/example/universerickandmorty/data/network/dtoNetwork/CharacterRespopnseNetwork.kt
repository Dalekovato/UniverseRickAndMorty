package com.example.universerickandmorty.data.network.dtoNetwork

import com.google.gson.annotations.SerializedName



data class CharacterRespopnseNetwork(

    @SerializedName("info") val info: InfoDtoNetwork?,
    @SerializedName("results") val results: List<CharacterDtoNetwork?>?

)
