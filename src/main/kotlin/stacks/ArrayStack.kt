package stacks

import IDataStructure

class ArrayStack : IDataStructure {

    private var arrayStack = arrayListOf<Int>()

    // Push new item onto the stack
    fun push(value: Int) {
        arrayStack.add(value)
    }

    // Peak item on top of stack
    fun top(): Int? = arrayStack.lastOrNull()

    // Pop item off the top of stack
    fun pop(): Int? = arrayStack.removeLastOrNull()

    // Get size of array stack
    fun size(): Int = arrayStack.size

    // Print content of array stack
    override fun print() {
        arrayStack.forEach {
            println(it)
        }
    }

    // Driver example
    override fun execute() {
        push(1)
        print()
        push(2)
        print()
        push(3)
        print()
        println(top())
        pop()
        print()
        pop()
        print()
        println("Size: ${size()}")
    }

}