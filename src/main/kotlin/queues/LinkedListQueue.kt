package queues

import IDataStructure
import linked_lists.SinglyLinkedList

class LinkedListQueue : IDataStructure, IQueue {

    private val singlyLinkedList = SinglyLinkedList()

    // Add item to queue
    override fun enqueue(label: String, value: Int) {
        singlyLinkedList.append(label, value)
    }

    // Return first item in queue
    override fun first(): Int? = singlyLinkedList.first()

    // Remove and returns first item in queue
    override fun dequeue(): Int? = singlyLinkedList.removeFirst()?.data

    // Check if queue is empty
    override fun isEmpty(): Boolean = singlyLinkedList.isEmpty()

    // Get size of linked list queue
    override fun size(): Int = singlyLinkedList.size

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