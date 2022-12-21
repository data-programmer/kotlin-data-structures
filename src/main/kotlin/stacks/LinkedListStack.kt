package stacks

import IDataStructure
import linked_lists.SinglyLinkedList

class LinkedListStack : IDataStructure, IStack {

    private val singlyLinkedList = SinglyLinkedList()

    // Push item onto stack
    override fun push(label: String, value: Int) {
        singlyLinkedList.insert(label, value)
    }

    // Peak item on top of stack
    override fun top() = singlyLinkedList.first()

    // Remove item on top of stack
    override fun pop(): Int? = singlyLinkedList.removeFirst()?.data

    // Return size of list
    override fun size() = singlyLinkedList.size

    // Check if list is empty
    override fun isEmpty() = singlyLinkedList.isEmpty()

    override fun print() {
        singlyLinkedList.print()
    }

    override fun execute() {
        push("Node A", 1)
        print()
        push("Node B", 2)
        print()
        println("Top: ${top()}")
        push("Node C", 3)
        println("Pop: ${pop()}")
        println("Size: ${size()}")
    }

}