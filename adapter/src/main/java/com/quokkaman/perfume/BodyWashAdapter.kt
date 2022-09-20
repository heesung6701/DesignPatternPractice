package com.quokkaman.perfume

import com.quokkaman.homedeco.BodyWash

class BodyWashAdapter(private val bodyWash: BodyWash) : Perfume {
    override fun getNoteInfo(): Any {
        return bodyWash.convertToNoteInfo()
    }

    override fun getSeasonal(): Any = bodyWash.convertToSeasonal()

    override fun getReverberation(): Any = bodyWash.convertToReverberation()
}

private fun BodyWash.convertToNoteInfo() = this.getSpices()
private fun BodyWash.convertToSeasonal() = this.getDescription()
private fun BodyWash.convertToReverberation() = this.getDescription()