package org.example1;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Print data " + Thread.currentThread().getName());
    }
}
