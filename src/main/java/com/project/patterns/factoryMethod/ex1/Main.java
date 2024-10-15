package com.project.patterns.factoryMethod.ex1;

import com.project.patterns.factoryMethod.ex1.delivery.Ship;
import com.project.patterns.factoryMethod.ex1.delivery.Truck;
import com.project.patterns.factoryMethod.ex1.factory.Transport;

import java.util.Random;

public class Main {

    private static Transport transport;

    public static void main(String... args) {
        configure();
        doBusinessLogic();
    }

    public static void configure() {
        if ((new Random().nextInt() * 3) == 1) {
            transport = new Ship();
        } else {
            transport = new Truck();
        }
    }

    public static void doBusinessLogic() {
        transport.deliver();
    }


}
