package queues

import IDataStructure

class ArrayQueue : IDataStructure {

    private var arrayQueue = arrayListOf<Int>()

    // Insert element into queue
    fun enqueue(value: Int) {
        arrayQueue.add(value)
    }

    // Return first item in queue
    fun first(): Int? = arrayQueue.firstOrNull()

    // Remove and returns first item of queue
    fun dequeue(): Int? = arrayQueue.removeFirstOrNull()


    // Check if queue is empty
    fun isEmpty(): Boolean = arrayQueue.size == 0

    // Get size of array queue
    fun size(): Int = arrayQueue.size

    // Print state of queue
    override fun print() {
        arrayQueue.forEach {
            println(it)
        }
    }

    // Driver example
    override fun execute() {
        enqueue(1)
        print()
        enqueue(2)
        print()
        enqueue(3)
        print()
        println("First: ${first()}")
        dequeue()
        print()
        dequeue()
        print()
        print("Size: ${size()}")
    }

}