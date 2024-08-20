package com.example.universerickandmorty.data.dto

import com.google.gson.annotations.SerializedName

class LocationDto (

    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?,

    )