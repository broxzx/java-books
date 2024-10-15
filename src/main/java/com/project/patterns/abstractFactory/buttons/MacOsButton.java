package com.project.patterns.abstractFactory.buttons;

public class MacOsButton implements Button{

    @Override
    public void onClick() {
        System.out.println("MacOs button was clicked");
    }

}
