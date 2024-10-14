package com.project.patterns.factoryMethod.ex1.delivery;

import com.project.patterns.factoryMethod.ex1.factory.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("truck is delivering");
    }

}
