import linked_lists.CircularSinglyLinkedList
import linked_lists.DoublyLinkedList
import linked_lists.SinglyLinkedList
import maps.HashTable
import maps.UnsortedMap
import queues.ArrayQueue
import queues.LinkedListQueue
import stacks.ArrayStack
import stacks.LinkedListStack
import trees.BinaryTree

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

val trees: List<IDataStructure> = listOf(
    BinaryTree()
)

val maps: List<IDataStructure> = listOf(
    UnsortedMap(),
    HashTable()
)

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

    // Execute all tree data structures
//    trees.forEach { treeStructure ->
//        println(treeStructure::class.java)
//        treeStructure.execute()
//    }

    // Execute all map data structures
    maps.forEach { mapStructure ->
        println(mapStructure::class.java)
        mapStructure.execute()
    }

    // Execute all binary tree data structures

}
