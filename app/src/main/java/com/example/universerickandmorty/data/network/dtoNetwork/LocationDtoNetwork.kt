package com.example.universerickandmorty.data.network.dtoNetwork

import com.google.gson.annotations.SerializedName

class LocationDtoNetwork (

    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?,

    )