package com.example.advanced;

import java.util.Arrays;
import java.util.List;

public class AnnotationsAndFunctional {
    @Override
    public String toString() {
        return "AnnotationsAndFunctional object.";
    }

    @Deprecated
    public void oldFeature() {
        System.out.println("Warning: This feature is deprecated.");
    }

    public static void main(String[] args) {
        AnnotationsAndFunctional app = new AnnotationsAndFunctional();
        app.oldFeature();
        System.out.println(app.toString());

        // Using List and Arrays
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("Printing fruits using a traditional loop:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Example of a simple array
        String[] colors = {"Red", "Green", "Blue"};
        System.out.println("Printing colors from an array:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("- " + colors[i]);
        }
    }
}
