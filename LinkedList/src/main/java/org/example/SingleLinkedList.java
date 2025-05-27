package org.example;

public class SingleLinkedList {
    public Node head;

    public void appendToTail(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
        while (current.data != null) {
            current = current.data;
        }
        current.data = new Node(value);
    }

    public void deleteNode(int value) {
        if (head == null) return;

        if (head.value == value) {
            head = head.data;
            return;
        }
        // 4-3-2-1
        Node current = head;
        while (current.data != null) {
            if (current.data.value == value) {
                current.data = current.data.data;
                return;
            }
            current = current.data;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        Node current = head;
        while (current.data != null) {
            System.out.print(current.value + " -> ");
            current = current.data;
        }
        System.out.println(current.value + " -> END");
    }
}
