package queues

interface IQueue {
    fun enqueue(label: String, value: Int)
    fun first(): Int?
    fun dequeue(): Int?
    fun size(): Int
    fun isEmpty(): Boolean
}