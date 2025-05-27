# Linked List

A Linked List in Java is a linear data structure where elements (called nodes) are connected using references (pointers). Unlike arrays, linked lists do not store elements in contiguous memory, and their size can change dynamically.

## Key Concepts:

Each node stores:

- The data
- A reference to the next node in the list

```Java
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```