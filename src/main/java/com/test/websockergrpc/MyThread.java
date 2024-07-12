package com.test.websockergrpc;

public class MyThread implements Runnable {
    @Override
    public void run() {
        // Your thread function logic
        for (int i = 0; i < 200; i++) {
            // Your thread function logic within the loop
            System.out.println("Thread iteration " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Add any other processing you need to do within the loop
            // For example, you might perform some computation or make
            // some external calls here.
        }
    }
}
