package com.quokkaman

abstract class PerfumeBuilder {
    enum class NoteType {
        TOP,
        MIDDLE,
        BASE
    }

    abstract fun setName(name: String): PerfumeBuilder
    abstract fun addNote(note: String, pos: NoteType): PerfumeBuilder

    abstract fun create(): IPerfume
}