package com.example.universerickandmorty.data.network.dto

import com.google.gson.annotations.SerializedName

class LocationDto (

    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?,

    )