package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet
        Set<String> hashSet = new HashSet<>();
        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // TreeSet
        Set<String> treeSet = new TreeSet<>();

        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, will not be added

        // Size
        System.out.println("Size: " + hashSet.size());

        // [Apple, Orange, Banana]
        System.out.println(hashSet);

        // Removing elements
        hashSet.remove("Orange");

        // [Apple, Banana]
        System.out.println(hashSet);

        // Iterating over the set
        for (String fruit: hashSet) {
            System.out.println(fruit);
        }
    }
}
