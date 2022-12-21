package linked_lists

import IDataStructure

class CircularSinglyLinkedList : IDataStructure, ILinkedList {

    private var tail: Node? = null
    var size: Int = 0

    // Insert node at beginning of list
    override fun insert(label: String, data: Int) {
        if (size == 0) {
            tail = Node(label, data)
            tail?.next = tail
        } else {
            val node = Node(label, data, tail?.next)
            tail?.next = node
        }
        size++
    }

    // Append node to end of list
    override fun append(label: String, data: Int) {
        insert(label, data)
        tail = tail?.next
    }

    // Remove node at start of list
    override fun removeFirst(): Node? {
        if (isEmpty()) return null
        val head = tail?.next
        if (head == tail) tail = null
        else tail?.next = head?.next
        size--
        return head
    }

    // Check if list is empty
    override fun isEmpty(): Boolean = size == 0

    // Print the state of the list
    override fun print() {
        var searchTail = tail
        for (i in 1..size) {
            println("${searchTail?.label}:${searchTail?.data} -> ${searchTail?.next?.label}")
            searchTail = searchTail?.next
        }
    }

    // Driver example
    override fun execute() {
        insert("Node A", 1)
        print()
        insert("Node B", 2)
        print()
        append("Node C", 3)
        print()
        removeFirst()
        print()
    }

}