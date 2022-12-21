package queues

import IDataStructure
import linked_lists.SinglyLinkedList

class LinkedListQueue : IDataStructure {

    private val singlyLinkedList = SinglyLinkedList()

    // Add item to queue
    fun enqueue(label: String, value: Int) {
        singlyLinkedList.append(label, value)
    }

    // Return first item in queue
    fun first(): Int? = singlyLinkedList.first()

    // Remove and returns first item in queue
    fun dequeue(): Int? = singlyLinkedList.removeFirst()

    // Check if queue is empty
    fun isEmpty(): Boolean = singlyLinkedList.isEmpty()

    // Get size of linked list queue
    fun size(): Int = singlyLinkedList.size

    // Print state of queue
    override fun print() {
        singlyLinkedList.print()
    }

    // Driver example
    override fun execute() {
        enqueue("Node A", 1)
        print()
        enqueue("Node B", 2)
        print()
        enqueue("Node C", 3)
        print()
        println("First: ${first()}")
        dequeue()
        print()
        dequeue()
        print()
        print("Size: ${size()}")
    }
}