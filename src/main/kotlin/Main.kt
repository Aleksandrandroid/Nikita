

fun main() {

    val goods = mutableListOf(
        Goods(1, "pencil", 5, 100),
        Goods(2, "rubber", 10, 100),
        Goods(3, "paper", 1, 100),
        Goods(4, "box", 12, 50)
    )

    goods[3].price = 130
    goods[3].qnt = 40
    println(goods)
    goods.removeAt(0)
    println(goods)
    println(goods)
}