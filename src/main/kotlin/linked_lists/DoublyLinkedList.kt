package linked_lists

import IDataStructure

class DoublyLinkedList : IDataStructure {

    private var head: Node? = null
    private var tail: Node? = null
    var size: Int = 0

    init {
        head = Node("Head Sentinel", -1, null, null)
        tail = Node("Tail Sentinel", -1, null, head)
        head?.next = tail
    }

    // Insert node at beginning of list
    fun insert(label: String, data: Int) {
        addBetween(label, data, head, head?.next)
    }

    // Append node to end of list
    fun append(label: String, data: Int) {
        addBetween(label, data, tail?.prev, tail)
    }

    // Remove node at start of list
    fun removeFirst(): Node? {
        if (isEmpty()) return null
        return remove(head?.next)
    }

    // Remove node at end of list
    fun removeLast(): Node? {
        if (isEmpty()) return null
        return remove(tail?.prev)
    }

    // Add node between connections
    private fun addBetween(label: String, data: Int, predecessor: Node?, successor: Node?) {
        val newNode = Node(label, data, successor, predecessor)
        predecessor?.next = newNode
        successor?.prev = newNode
        size++
    }

    // Remove node from connections
    private fun remove(node: Node?): Node? {
        val predecessor = node?.prev
        val successor = node?.next
        predecessor?.next = successor
        successor?.prev = predecessor
        size--
        return node
    }

    // Check if list is empty
    fun isEmpty(): Boolean = size == 0

    // Print the state of the list
    override fun print() {
        var node: Node? = head
        // Account for sentinels
        for (i in 1..size + 2) {
            println("${node?.prev?.label} <- ${node?.label}:${node?.data} -> ${node?.next?.label}")
            node = node?.next
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
        insert("Node D", 4)
        print()
        removeFirst()
        print()
        removeLast()
        print()
    }

    // Node class
    inner class Node(
        val label: String,
        val data: Int,
        var next: Node? = null,
        var prev: Node? = null
    )

}