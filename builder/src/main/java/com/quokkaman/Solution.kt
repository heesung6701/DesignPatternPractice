package com.quokkaman

fun main() {
    val perfume = ConcretePerfumeBuilder().apply {
        setName("154 코롱")
        listOf(
            Pair(PerfumeBuilder.NoteType.TOP, "그레이프프루트,만다린 오렌지,베르가못"),
            Pair(PerfumeBuilder.NoteType.MIDDLE, "라벤더,바질,너트메그"),
            Pair(PerfumeBuilder.NoteType.BASE, "파촐리,베티버,머스크,바닐라")
        ).forEach {
            it.second.split(",").forEach { noteName ->
                this.addNote(
                    noteName, it.first
                )
            }
        }
    }.create()
    
    println(perfume)
}