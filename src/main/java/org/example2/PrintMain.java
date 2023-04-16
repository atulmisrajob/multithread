package org.example2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintMain {
    public static void main(String[] args) {
        for (int i=1;i<100;++i){
            PrintTask100 printTask100 = new PrintTask100(i);
//            Thread thread= new Thread(printTask100);
//            thread.start();
            Executor executor= Executors.newFixedThreadPool(20);
            executor.execute(printTask100);
        }
    }
}
