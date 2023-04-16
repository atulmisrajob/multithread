package org.example1;

public class Main {

    public static void main(String[] args) {
        PrintTask printTask = new PrintTask();
        Thread thread = new Thread(printTask);
        thread.start();
    }
}
