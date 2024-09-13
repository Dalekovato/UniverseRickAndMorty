package com.example.universerickandmorty.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class InfoDomain(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String,
): Parcelable