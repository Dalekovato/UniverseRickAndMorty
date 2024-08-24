package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

@Parcelize
class LocationDomain(

    val name: String,
    val url: String

): Parcelable