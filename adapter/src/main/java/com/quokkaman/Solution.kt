package com.quokkaman

import com.quokkaman.homedeco.BodyWash
import com.quokkaman.perfume.BodyWashAdapter
import com.quokkaman.perfume.DiffuserAdapter
import com.quokkaman.perfume.Perfume
import com.quokkaman.toiletries.Diffuser


fun main() {
    val perfumes = mutableListOf<Perfume>()
    perfumes.add(object : Perfume {
        override fun getNoteInfo(): Any = "향수 노트 정보"

        override fun getSeasonal(): Any = "향수 계절감 정å보"

        override fun getReverberation(): Any = "향수 잔향감 정보"
    })
    perfumes.add(BodyWashAdapter(getExistingBodyWash()))
    perfumes.add(DiffuserAdapter(getExistingDiffuser()))

    perfumes.forEach {
        println("-----")
        println(it.getNoteInfo())
        println(it.getSeasonal())
        println(it.getReverberation())
    }
}

fun getExistingDiffuser() = object : Diffuser {
    override fun getIngredients(): Any = listOf("라임", "베르가못")

    override fun getDescription(): String = "계절감은 여름이고 지속력은 오래가는 디퓨저 입니다."
}

fun getExistingBodyWash() = object : BodyWash {
    override fun getSpices(): Any = "베리, 카카오"

    override fun getDescription(): String = "가을에 산뜻한 향으로 기분을 전환시켜 보세요."
}