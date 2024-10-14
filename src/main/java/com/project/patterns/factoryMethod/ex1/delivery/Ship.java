package com.project.patterns.factoryMethod.ex1.delivery;

import com.project.patterns.factoryMethod.ex1.factory.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("ship is delivering");
    }

}
