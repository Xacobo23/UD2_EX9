package org.example;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static final int NUM_THREADS = 10;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);


        int randomNumber = new Random().nextInt(0,100);
        System.out.println(randomNumber);
        for (int i = 0; i < NUM_THREADS; i++) {
            Runnable runnable = new HiddenNumberRunnable(randomNumber);
            pool.execute(runnable);
        }

        pool.shutdown();
    }
}