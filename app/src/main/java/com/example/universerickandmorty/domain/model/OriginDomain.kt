package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

@Parcelize
class OriginDomain @Inject constructor(

    val name: String,
    val url: String

): Parcelable