package org.example.concurrency;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start(); // Start thread1

        // Wait for thread1 to complete before continuing
        thread1.join();

        System.out.println("Main thread: Thread 1 has finished.");
    }
}

