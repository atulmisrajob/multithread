package org.example3;

import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        PrintCallable printCallable= new PrintCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

       Future<Integer> i= executorService.submit(printCallable);
        Future<Integer> j= executorService.submit(printCallable);
        System.out.println(i.get()+" "+j.get()+" sum "+(i.get()+j.get()));
        executorService.shutdown();

    }
}
