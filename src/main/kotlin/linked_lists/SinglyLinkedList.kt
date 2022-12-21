package linked_lists

import IDataStructure

class SinglyLinkedList : IDataStructure {

    private var head: Node? = null
    private var tail: Node? = null
    var size: Int = 0

    // Insert node at beginning of list
    fun insert(label: String, data: Int) {
        head = Node(label, data, head)
        if (isEmpty()) tail = head
        size++
    }

    // Append node to end of list
    fun append(label: String, data: Int) {
        val node = Node(label, data)
        if (isEmpty()) head = node
        else tail?.next = node
        tail = node
        size++
    }

    // Remove node at start of list
    fun removeFirst(): Int? {
        return head?.let { oldHead ->
            head = oldHead.next
            size--
            oldHead.data
        }
    }

    // Check first item in linked list
    fun first(): Int? = head?.data

    // Check if list is empty
    fun isEmpty(): Boolean = size == 0

    // Print the state of the list
    override fun print() {
        var searchHead = head
        for (i in 1..size) {
            println("${searchHead?.label}:${searchHead?.data} -> ${searchHead?.next?.label}")
            searchHead = searchHead?.next
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

    // Node class
    inner class Node(
        val label: String,
        val data: Int,
        var next: Node? = null
    )

}