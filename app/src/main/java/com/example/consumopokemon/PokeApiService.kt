package com.example.consumopokemon

import retrofit2.http.GET
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon")
    suspend fun getPokemonList( //una consulta de un limite
        @Query("limit") limit: Int = 35
    ): PokemonListResponse


}