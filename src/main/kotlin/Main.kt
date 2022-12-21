import linked_lists.CircularSinglyLinkedList
import linked_lists.DoublyLinkedList
import linked_lists.SinglyLinkedList
import queues.ArrayQueue
import queues.LinkedListQueue
import stacks.ArrayStack
import stacks.LinkedListStack

val linkedLists: List<IDataStructure> = listOf(
    SinglyLinkedList(),
    CircularSinglyLinkedList(),
    DoublyLinkedList()
)

val stacks: List<IDataStructure> = listOf(
    ArrayStack(),
    LinkedListStack()
)

val queues: List<IDataStructure> = listOf(
    ArrayQueue(),
    LinkedListQueue()
)

val binaryTrees: List<IDataStructure> = emptyList()

val tables: List<IDataStructure> = emptyList()

fun main() {
    // Execute all list data structures
    linkedLists.forEach { listStructure ->
        println(listStructure::class.java)
        listStructure.execute()
    }

    // Execute all stack data structures
    stacks.forEach { stackStructure ->
        println(stackStructure::class.java)
        stackStructure.execute()
    }

    // Execute all queue data structures
    queues.forEach { queueStructure ->
        println(queueStructure::class.java)
        queueStructure.execute()
    }



    // Execute all table data structures

    // Execute all binary tree data structures

}
