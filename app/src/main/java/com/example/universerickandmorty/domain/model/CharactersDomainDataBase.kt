package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import com.example.universerickandmorty.data.network.dto.StatusImg
import kotlinx.parcelize.Parcelize

@Parcelize
class CharactersDomainDataBase (
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: String,
    val location: String,
    val image: String,
    val episode: String,
    val url: String,
    val created: String,
): Parcelable