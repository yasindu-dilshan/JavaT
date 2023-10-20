package org.example.concurrency;

public class VolatileExample {
    private boolean flag = false;

    public void toggleFlag() {
        flag = !flag; // A simple operation on a volatile variable
    }

    public boolean isFlag() {
        return flag; // A simple read of a volatile variable
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        // Thread 1 - Sets the flag to true
        Thread thread1 = new Thread(() -> {
            example.toggleFlag();
        });

        // Thread 2 - Reads the flag
        Thread thread2 = new Thread(() -> {
            boolean result = example.isFlag();
            System.out.println("Flag is: " + result);
        });

        thread1.start();
        thread2.start();
    }
}
