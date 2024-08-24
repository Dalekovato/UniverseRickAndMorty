package com.example.universerickandmorty.data.dto

import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class CharacterDto (

    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("status") val status: StatusImg?,
    @SerializedName("species") val species: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("gender") val gender: String?,
    @SerializedName("origin") val origin: OriginDto?,
    @SerializedName("location") val location: LocationDto?,
    @SerializedName("image") val image: String?,
    @SerializedName("episode") val episode: List<String?>?,
    @SerializedName("url") val url: String?,
    @SerializedName("created") val created: String?,

    )




