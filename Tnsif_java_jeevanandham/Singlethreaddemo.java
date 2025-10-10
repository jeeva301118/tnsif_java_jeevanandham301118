package com.tnsif.entityassignment;

public class Singlethreaddemo {
    public static void main(String[] args) {
        // Create a Runnable that represents the work for the independent path
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Worker thread: step " + i);
                    try {
                        Thread.sleep(500); // simulate work (500 ms)
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Worker interrupted");
                        return;
                    }
                }
                System.out.println("Worker finished.");
            }
        };

        // Start the independent thread
        Thread worker = new Thread(task, "WorkerThread");
        worker.start();

        // Main thread continues independently
        for (int j = 1; j <= 3; j++) {
            System.out.println("Main thread: tick " + j);
            try { Thread.sleep(700); } catch (InterruptedException e) { }
        }

        System.out.println("Main thread done (didn't wait for worker).");
        // If you wanted to wait: worker.join();
    }
}