package com.example.universerickandmorty.data.dto

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class LocationDto (

    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?,

    )