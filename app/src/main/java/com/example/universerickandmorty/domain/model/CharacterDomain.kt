package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class CharacterDomain(
    val id: Int,
    val name: String,
    val status: String,
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





