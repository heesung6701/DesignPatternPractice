package com.quokkaman.perfume

import com.quokkaman.toiletries.Diffuser

class DiffuserAdapter(private val diffuser: Diffuser) : Perfume {
    override fun getNoteInfo(): Any {
        return diffuser.convertToNoteInfo()
    }

    override fun getSeasonal(): Any = diffuser.convertToSeasonal()

    override fun getReverberation(): Any = diffuser.convertToReverberation()
}
private fun Diffuser.convertToNoteInfo() = this.getIngredients()
private fun Diffuser.convertToSeasonal() = this.getDescription()
private fun Diffuser.convertToReverberation() = this.getDescription()