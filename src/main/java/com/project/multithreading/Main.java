package com.project.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        multithreadingTest(service);

        singleThreadTest(service);
    }

    private static void multithreadingTest(Service service) {
        long start = System.currentTimeMillis();
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            executorService.execute(service::readData);
            executorService.execute(service::showGreetingMessage);
            executorService.execute(() -> {
                service.calculateFactorial(50);
            });
            executorService.execute(() -> {
                service.calculateSum(100);
            });

            executorService.execute(service::finishProgram);

        } finally {
            long finish = System.currentTimeMillis();
            System.out.println("with multithreading: " + (finish - start));
        }

    }

    private static void singleThreadTest(Service service) {
        long start = System.currentTimeMillis();

        service.readData();
        service.showGreetingMessage();
        service.calculateFactorial(50);
        service.calculateSum(100);
        service.finishProgram();

        long finish = System.currentTimeMillis();
        System.out.println("single thread: " + (finish - start));
    }

}
