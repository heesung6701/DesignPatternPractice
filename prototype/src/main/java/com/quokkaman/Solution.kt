package com.quokkaman

fun main() {
    MenuManager.putMenu(Americano())
    MenuManager.putMenu(Cappuccino())

    val orderList = listOf(
        "아이스 아메리카노 샷 추가",
        "아이스티",
        "아메리카노",
        "카푸치노",
        "에스프레소",
        "아이스 아메리카노 샷 추가",
        "아이스티",
        "아이스티 샷 추가",
    )
    for (order in orderList) {
        val price = MenuManager.getMenu(order).getPrice()
        println("$order 의 가격은 $price 입니다.")
    }

}

object MenuManager {
    private val history = HashMap<String, Menu>()

    fun getMenu(name: String) = history[name] ?: object : Menu {
        private val _price = calculatePrice(name)
        override fun getName(): String = name
        override fun getPrice(): Int = _price
    }.apply {
        history[name] = this
    }

    fun putMenu(menu: Menu) {
        history[menu.getName()] = menu
    }

    private fun calculatePrice(name: String) = name.length * 400 + (Math.random() * 5000).toInt()

}