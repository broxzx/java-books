package com.project.patterns.factoryMethod.delivery;

import com.project.patterns.factoryMethod.factory.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("truck is delivering");
    }

}
