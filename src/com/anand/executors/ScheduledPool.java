package com.anand.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class RunWorkScheduled extends Thread {

    @Override
    public void run() {
        System.out.println("DB backup");
    }
}

public class ScheduledPool {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        service.schedule(new RunWorkScheduled(), 15, TimeUnit.SECONDS);

       service.scheduleAtFixedRate(new RunWorkScheduled(), 2, 2,TimeUnit.SECONDS );

        service.scheduleWithFixedDelay(new RunWorkScheduled(), 2, 2,TimeUnit.SECONDS);
    }
}
