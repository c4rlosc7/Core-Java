# Stacks

Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of LIFO(last-in-first-out). In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.

- The Stack class extends Vector and provides additional functionality specifically for stack operations, such as push, pop, peek, empty, and search.
- The Stack class can indeed be referred to as a subclass of Vector, inheriting its methods and properties.

```Java
public class StackDemo {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Pop elements from the stack
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
```