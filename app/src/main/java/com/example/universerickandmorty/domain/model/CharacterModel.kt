package com.example.universerickandmorty.domain.model

data class CharacterAllModel(
    val info: InfoModel,
    val listCharacters: List<CharacterDomain>,
)

data class InfoModel(
    val count: Int,
//    val next: String,
//    val pages: Int,
//    val prev: Any? = null
)
