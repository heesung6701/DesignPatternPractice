package com.quokkaman

class Cappuccino : Menu {
    override fun getPrice(): Int = 4500
    override fun getName(): String = "카푸치노"
    override fun copy(): Menu = Cappuccino()
}