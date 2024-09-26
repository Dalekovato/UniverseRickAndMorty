package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseDomain (

    val info: InfoDomain,
    val listCharacters: List<CharactersDomainApi>,

    ): Parcelable

