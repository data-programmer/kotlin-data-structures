package linked_lists

import IDataStructure

class SinglyLinkedList : IDataStructure, ILinkedList {

    private var head: Node? = null
    private var tail: Node? = null
    var size: Int = 0

    // Insert node at beginning of list
    override fun insert(label: String, data: Int) {
        head = Node(label, data, head)
        if (isEmpty()) tail = head
        size++
    }

    // Append node to end of list
    override fun append(label: String, data: Int) {
        val node = Node(label, data)
        if (isEmpty()) head = node
        else tail?.next = node
        tail = node
        size++
    }

    // Remove node at start of list
    override fun removeFirst(): Node? {
        return head?.let { oldHead ->
            head = oldHead.next
            size--
            oldHead
        }
    }

    // Check first item in linked list
    fun first(): Int? = head?.data

    // Check if list is empty
    override fun isEmpty(): Boolean = size == 0

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

}