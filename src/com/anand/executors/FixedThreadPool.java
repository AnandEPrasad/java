package com.anand.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunWork extends Thread {

    int i;
    RunWork(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("DB migration " + i +", thread = " + Thread.currentThread());
    }
}
public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 100; i++) {
            service.execute(new RunWork(i));
        }
        service.shutdown();
    }
}
