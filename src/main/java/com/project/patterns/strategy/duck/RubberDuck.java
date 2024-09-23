package com.project.patterns.strategy.duck;

import com.project.patterns.strategy.movements.FlyNoWay;
import com.project.patterns.strategy.sounds.Squeak;

public class RubberDuck extends com.project.patterns.strategy.duck.Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

}
