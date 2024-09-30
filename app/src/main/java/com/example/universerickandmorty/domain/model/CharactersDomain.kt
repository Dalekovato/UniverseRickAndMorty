package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork
import kotlinx.parcelize.Parcelize

@Parcelize
class CharactersDomain(
    val id: Int,
    val name: String,
    val status: StatusImgNetwork,
    val species: String,
    val type: String,
    val gender: String,
    val origin: OriginDomain,
    val location: LocationDomain,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String,
): Parcelable





