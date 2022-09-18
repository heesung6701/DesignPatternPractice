package com.quokkaman

data class Perfume(
    override val name: String,
    override val topNotes: List<String>,
    override val middleNotes: List<String>,
    override val baseNotes: List<String>
) : IPerfume