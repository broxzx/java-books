package com.project.patterns.factoryMethod;

import com.project.patterns.factoryMethod.delivery.RoadLogistic;
import com.project.patterns.factoryMethod.delivery.SeaLogistic;
import com.project.patterns.factoryMethod.factory.Transport;

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
