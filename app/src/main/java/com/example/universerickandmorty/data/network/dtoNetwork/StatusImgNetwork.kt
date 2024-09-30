package com.example.universerickandmorty.data.network.dtoNetwork

import com.google.gson.annotations.SerializedName

enum class StatusImgNetwork (val value: String) {

    @SerializedName("Alive") ALIVE ("Alive"),
    @SerializedName("Dead") DEAD ("Dead"),
    UNKNOWN ("Unknown")

}