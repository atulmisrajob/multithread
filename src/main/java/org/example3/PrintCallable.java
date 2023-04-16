package org.example3;

import java.util.Random;
import java.util.concurrent.Callable;

public class PrintCallable implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random= new Random();
       return random.nextInt(10);
    }
}
