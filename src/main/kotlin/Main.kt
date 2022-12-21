import linked_lists.CircularDoublyLinkedList
import linked_lists.CircularSinglyLinkedList
import linked_lists.DoublyLinkedList
import linked_lists.SinglyLinkedList

val linkedLists: List<IDataStructure> = listOf(
    SinglyLinkedList(),
    CircularSinglyLinkedList(),
    DoublyLinkedList(),
    CircularDoublyLinkedList()
)

val binaryTrees: List<IDataStructure> = emptyList()

val tables: List<IDataStructure> = emptyList()

fun main() {
    // Execute all list data structures
    linkedLists.forEach { listStructure ->
        println(listStructure::class.java)
        listStructure.execute()
    }

    // Execute all table data structures

    // Execute all binary tree data structures

}
