package com.project.patterns.duck;

import com.project.patterns.movements.FlyNoWay;
import com.project.patterns.sounds.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

}
