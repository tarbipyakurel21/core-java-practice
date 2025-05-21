package com.example.advanced;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Exceptions {

    public void tryReadFile(String fileName) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader(fileName);
            System.out.println("File opened: " + fileName);
            reader.close();
        } catch (FileNotFoundException e) {
            throw e; // Re-throw to be caught by caller
        } catch (IOException e) {
            System.err.println("Error closing file: " + e.getMessage());
        }
    }

    public void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Value cannot be negative.");
        }
        System.out.println("Value is: " + value);
    }

    public double divideNumbers(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Exceptions demo = new Exceptions();

        try {
            demo.tryReadFile("non_existent.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Caught: " + e.getMessage());
        }

        try {
            demo.checkValue(-10);
        } catch (MyCustomException e) {
            System.err.println("Caught: " + e.getMessage());
        }

        try {
            System.out.println("Division result: " + demo.divideNumbers(10, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Caught: " + e.getMessage());
        }
    }
}
