package com.quokkaman

interface Menu{
    fun getPrice(): Int
    fun getName(): String

    fun copy(): Menu
}