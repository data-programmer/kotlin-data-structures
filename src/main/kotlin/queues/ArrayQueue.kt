package queues

import IDataStructure

class ArrayQueue : IDataStructure, IQueue {

    private var arrayQueue = arrayListOf<Int>()

    // Insert element into queue
    override fun enqueue(label: String, value: Int) {
        // Ignore label in this queue
        arrayQueue.add(value)
    }

    // Return first item in queue
    override fun first(): Int? = arrayQueue.firstOrNull()

    // Remove and returns first item of queue
    override fun dequeue(): Int? = arrayQueue.removeFirstOrNull()

    // Check if queue is empty
    override fun isEmpty(): Boolean = arrayQueue.size == 0

    // Get size of array queue
    override fun size(): Int = arrayQueue.size

    // Print state of queue
    override fun print() {
        arrayQueue.forEach {
            println(it)
        }
    }

    // Driver example
    override fun execute() {
        enqueue("Item A",1)
        print()
        enqueue("Item B",2)
        print()
        enqueue("Item C",3)
        print()
        println("First: ${first()}")
        dequeue()
        print()
        dequeue()
        print()
        print("Size: ${size()}")
    }

}