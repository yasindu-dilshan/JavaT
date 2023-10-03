package org.example.concurrency;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SynchronizedListExample {
    public static void main(String[] args) {
        // Create a synchronized list
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Create two threads that add elements to the synchronized list
        Thread thread1 = new Thread(new AddElementTask(synchronizedList, "Thread 1"));
        Thread thread2 = new Thread(new AddElementTask(synchronizedList, "Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the synchronized list
        System.out.println("Synchronized List: " + synchronizedList);
    }

    static class AddElementTask implements Runnable {
        private final List<Integer> synchronizedList;
        private final String threadName;

        public AddElementTask(List<Integer> synchronizedList, String threadName) {
            this.synchronizedList = synchronizedList;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (synchronizedList) {
                    synchronizedList.add(i);
                    System.out.println(threadName + " added: " + i);
                }

                try {
                    Thread.sleep(100); // Simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
