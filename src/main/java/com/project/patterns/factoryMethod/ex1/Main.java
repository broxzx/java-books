package com.project.patterns.factoryMethod.ex1;

import com.project.patterns.factoryMethod.ex1.delivery.RoadLogistic;
import com.project.patterns.factoryMethod.ex1.delivery.SeaLogistic;
import com.project.patterns.factoryMethod.ex1.factory.Transport;

public class Main {

    public static void main(String... args) {
        RoadLogistic roadLogistic = new RoadLogistic();
        roadLogistic.planDelivery();
        Transport roadTransport = roadLogistic.createTransport();
        roadTransport.deliver();

        SeaLogistic seaLogistic = new SeaLogistic();
        seaLogistic.planDelivery();
        Transport seaTransport = seaLogistic.createTransport();
        seaTransport.deliver();
    }

}
