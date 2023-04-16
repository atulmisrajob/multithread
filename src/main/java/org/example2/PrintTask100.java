package org.example2;

public class PrintTask100 implements Runnable {
    private int printNumber;

    public PrintTask100(int printNumber) {
        this.printNumber = printNumber;
    }

    @Override
    public void run() {
        System.out.println(printNumber+" printNumber "+Thread.currentThread().getName());
    }
}
