package com.anand.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 100; i++) {
            service.execute(new RunWork(i));
        }
        service.shutdown();
    }
}
