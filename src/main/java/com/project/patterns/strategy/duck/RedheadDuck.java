package com.project.patterns.strategy.duck;

import com.project.patterns.strategy.movements.FlyWithWings;
import com.project.patterns.strategy.sounds.Quack;

public class RedheadDuck extends com.project.patterns.strategy.duck.Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

}
