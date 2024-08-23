package com.example.universerickandmorty.data.dto

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

enum class StatusImg@Inject constructor(val value: String) {

    @SerializedName("Alive") ALIVE ("Alive"),
    @SerializedName("Dead") DEAD ("Dead"),
    UNKNOWN ("Unknown")

}