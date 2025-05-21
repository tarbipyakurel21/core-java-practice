package com.example.advanced;

mport java.io.FileReader;
import java.io.IOException;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Exceptions {

    public void readFile(String fileName) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            System.out.println("File opened.");
        } finally {
            if (reader != null) {
                reader.close();
                System.out.println("File closed.");
            }
        }
    }

    public void doSomethingRisky(int value) throws CustomCheckedException {
        if (value < 0) {
            throw new CustomCheckedException("Value cannot be negative.");
        }
        System.out.println("Value is positive: " + value);
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Exceptions demo = new Exceptions();

        try {
            demo.readFile("nonexistent.txt");
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }

        try {
            demo.doSomethingRisky(-5);
        } catch (CustomCheckedException e) {
            System.err.println("Risky operation failed: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + demo.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Division error: " + e.getMessage());
        }
    }
}
