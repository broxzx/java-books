package com.project.patterns.duck;

import com.project.patterns.movements.FlyNoWay;
import com.project.patterns.sounds.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(FlyNoWay flyBehaviour, Squeak quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

}
