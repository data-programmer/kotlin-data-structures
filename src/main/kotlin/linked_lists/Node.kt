package linked_lists

// Node class
data class Node(
    val label: String,
    val data: Int,
    var next: Node? = null,
    var prev: Node? = null
)
