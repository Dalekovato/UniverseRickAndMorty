package com.example.universerickandmorty.data.network.dtoNetwork

import com.google.gson.annotations.SerializedName

data class CharacterDtoNetwork (

    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("status") val status: StatusImgNetwork?,
    @SerializedName("species") val species: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("gender") val gender: String?,
    @SerializedName("origin") val origin: OriginDtoNetwork?,
    @SerializedName("location") val location: LocationDtoNetwork?,
    @SerializedName("image") val image: String?,
    @SerializedName("episode") val episode: List<String?>?,
    @SerializedName("url") val url: String?,
    @SerializedName("created") val created: String?,

    )




