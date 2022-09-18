package com.quokkaman

class ConcretePerfumeBuilder : PerfumeBuilder() {

    private var name: String? = null
    private val topNotes: MutableList<String> = mutableListOf()
    private val middleNotes: MutableList<String> = mutableListOf()
    private val baseNotes: MutableList<String> = mutableListOf()

    override fun setName(name: String): PerfumeBuilder = this.apply {
        this.name = name
    }

    override fun addNote(note: String, pos: NoteType): PerfumeBuilder = this.apply {
        when (pos) {
            NoteType.TOP -> {
                topNotes.add(note)
            }

            NoteType.MIDDLE -> {
                middleNotes.add(note)
            }

            NoteType.BASE -> {
                baseNotes.add(note)
            }
        }
    }

    override fun create(): IPerfume = Perfume(name ?: "", topNotes, middleNotes, baseNotes)
}