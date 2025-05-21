package com.example.advanced;
class MyWorker implements Runnable {
    private String name;
    public MyWorker(String name) { this.name = name; }

    @Override
    public void run() {
        System.out.println(name + " started.");
        try {
            Thread.sleep(50); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " finished.");
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread worker1 = new Thread(new MyWorker("Worker-1"));
        Thread worker2 = new Thread(new MyWorker("Worker-2"));

        worker1.start(); // Start Worker-1
        worker2.start(); // Start Worker-2

        System.out.println("Main thread running.");

        worker1.join(); // Wait for Worker-1 to complete
        worker2.join(); // Wait for Worker-2 to complete
        System.out.println("All workers done.");
    }
}
