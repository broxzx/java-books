package com.project.patterns.factoryMethod.delivery;

import com.project.patterns.factoryMethod.factory.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("ship is delivering");
    }

}
