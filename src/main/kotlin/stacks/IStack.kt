package stacks

interface IStack {
    fun push (label: String, value: Int)
    fun top(): Int?
    fun pop(): Int?
    fun size(): Int
    fun isEmpty(): Boolean
}