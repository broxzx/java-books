package com.project.patterns.abstractFactory.buttons;

public class WindowsButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Windows button was clicked");
    }

}
