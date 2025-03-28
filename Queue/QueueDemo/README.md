# Queue
A queue in data structure is a linear list of items that follows the First-In-First-Out (FIFO) principle. This means that the first item added to the queue is the first to be removed. 
### How it works
Items are added to the queue at the rear, or back, end 
Items are removed from the queue at the front, or head, end 
The first item added to the queue is the first to be removed 
### Applications
Queues are used in operating systems to manage tasks 
Queues are used to handle customers in line at a bank 
Queues are used to implement job scheduling for an office printer 
Queues are used to process orders for e-tickets 
Queues are used to create algorithms for breadth-first search in graphs 

```Java
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        // look it: https://www.geeksforgeeks.org/difference-between-add-and-offer-methods-in-queue-in-java/
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.offer("test");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}
```