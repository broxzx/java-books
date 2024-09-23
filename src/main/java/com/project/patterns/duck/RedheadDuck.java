package com.project.patterns.duck;

import com.project.patterns.movements.FlyWithWings;
import com.project.patterns.sounds.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

}
