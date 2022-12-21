package stacks

import IDataStructure

class ArrayStack : IDataStructure, IStack {

    private var arrayStack = arrayListOf<Int>()

    // Push new item onto the stack
    override fun push(label: String, value: Int) {
        // Ignore label in this stack
        arrayStack.add(value)
    }

    // Peak item on top of stack
    override fun top(): Int? = arrayStack.lastOrNull()

    // Pop item off the top of stack
    override fun pop(): Int? = arrayStack.removeLastOrNull()

    // Get size of array stack
    override fun size(): Int = arrayStack.size

    // Check if list is empty
    override fun isEmpty() = arrayStack.isEmpty()

    // Print content of array stack
    override fun print() {
        arrayStack.forEach {
            println(it)
        }
    }

    // Driver example
    override fun execute() {
        push("Item A",1)
        print()
        push("Item B",2)
        print()
        push("Item C",3)
        print()
        println(top())
        pop()
        print()
        pop()
        print()
        println("Size: ${size()}")
    }

}