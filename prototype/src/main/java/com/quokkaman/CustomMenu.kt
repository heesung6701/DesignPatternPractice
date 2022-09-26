package com.quokkaman

class CustomMenu(private val customName: String, private val customPrice:Int) : Menu{
    override fun getPrice(): Int = customPrice
    override fun getName(): String = customName

    override fun copy(): CustomMenu = CustomMenu(customName, customPrice)
}