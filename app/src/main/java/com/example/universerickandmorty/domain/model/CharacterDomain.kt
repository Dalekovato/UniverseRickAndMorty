package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import com.example.universerickandmorty.data.dto.StatusImg
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

@Parcelize
class CharacterDomain@Inject constructor(
    val id: Int,
    val name: String,
    val status: StatusImg,
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





