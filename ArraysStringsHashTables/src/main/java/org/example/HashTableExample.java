package org.example;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        int value = hashtable.get("Two");
        System.out.println("Value: " + value);

        boolean hasKey = hashtable.containsKey("One");
        System.out.println(hasKey);
        boolean hasValue = hashtable.containsValue(1);
        System.out.println(hasValue);

        for (String key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
