class LootBox<T: Loot>(item: T) {
    var open = true
    private var loot: T = item

    fun fetch(): T? {
        return loot.takeIf { open } //При вызове takeIf для объекта с предикатом этот объект будет возвращен, если он соответствует предикату
    }

    fun <R> fetch(initial: (T) -> R): R? {
        return initial(loot).takeIf { open }
    }
}