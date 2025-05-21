package com.example.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionAndStreams {

    public static void main(String[] args) {
        // --- Collections: List (ArrayList) ---
        List<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Laptop"); // Duplicates are allowed in List

        System.out.println("Items in List:");
        for (String item : items) {
            System.out.println("- " + item);
        }
        System.out.println("First item: " + items.get(0));
        System.out.println("List size: " + items.size());

        // --- Collections: Array ---
        String[] colors = {"Red", "Green", "Blue"};
        System.out.println("\nColors in Array:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("- " + colors[i]);
        }
        System.out.println("Array length: " + colors.length);
    }
}
