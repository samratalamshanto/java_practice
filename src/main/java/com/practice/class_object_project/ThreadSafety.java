package com.practice.class_object_project;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    //AtomicInteger
    AtomicInteger count2 = new AtomicInteger();

    public void increment2() {
        count2.incrementAndGet();
    }

    //synchronized keyword used for thread safety

    int count;

    public synchronized void increment() {
        this.count++;
    }
}

public class ThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c1.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c1.increment();
                }


            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();


//        for (int i = 0; i < 1000; i++) {
//            c1.increment();
//        }

        System.out.println(c1.count);

    }
}
