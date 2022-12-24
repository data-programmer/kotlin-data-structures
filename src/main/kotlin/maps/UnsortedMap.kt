package maps

import IDataStructure

class UnsortedMap: IDataStructure {

    private val entries: MutableSet<Map.Entry<String, Int>> = mutableSetOf()

    fun size(): Int = entries.size

    fun get(key: String): Int? {
        return when (val idx = findIndex(key)) {
            -1 -> null
            else -> entries.elementAt(idx).value
        }
    }

    fun put(key: String, value: Int) {
        val element = entries.elementAtOrNull(findIndex(key))
        if (element != null) entries.remove(element)
        entries.add(Pair(key, value).toEntry())
    }

    fun remove(key: String): Int? {
        return when (val element = entries.elementAtOrNull(findIndex(key))) {
            null -> null
            else -> {
                entries.remove(element)
                element.value
            }
        }
    }

    private fun findIndex(key: String): Int {
        // Not very efficient O(n) on lookup
        entries.forEach { entry ->
            if (entry.key == key) {
                return entries.indexOf(entry)
            }
        }
        return -1
    }

    private fun <K,V> Pair<K,V>.toEntry() = object: Map.Entry<K,V> {
        override val key: K = first
        override val value: V = second
    }

    override fun print() {
        entries.forEach { mapEntry ->
            println("Key: ${mapEntry.key}, Value: ${mapEntry.value}")
        }
    }

    override fun execute() {
        put("Item A", 1)
        put("Item B", 2)
        put("Item C", 3)
        print()
        println("Item: ${get("Item A")}")
        remove("Item B")
        print()
    }

}