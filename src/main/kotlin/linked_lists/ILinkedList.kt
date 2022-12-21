package linked_lists

interface ILinkedList {
    fun insert(label: String, data: Int)
    fun append(label: String, data: Int)
    fun removeFirst(): Node?
    fun isEmpty(): Boolean
}