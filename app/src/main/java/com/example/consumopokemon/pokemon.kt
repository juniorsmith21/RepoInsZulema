package com.example.consumopokemon

data class pokemon(
    val name: String,
    val url: String

)

data class  PokemonListResponse(
    val  result: List <pokemon>

)
