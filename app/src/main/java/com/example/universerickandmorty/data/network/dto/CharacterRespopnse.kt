package com.example.universerickandmorty.data.network.dto

import com.google.gson.annotations.SerializedName



data class CharacterRespopnse(

    @SerializedName("info") val info: InfoDto?,
    @SerializedName("results") val results: List<CharacterDto?>?

)
