package com.project.patterns.factoryMethod.ex1.delivery;

import com.project.patterns.factoryMethod.ex1.factory.Logistic;
import com.project.patterns.factoryMethod.ex1.factory.Transport;

public class SeaLogistic implements Logistic {

    @Override
    public void planDelivery() {
        System.out.println("sea logistic is planning a delivery");
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
