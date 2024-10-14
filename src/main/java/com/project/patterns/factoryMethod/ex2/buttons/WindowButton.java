package com.project.patterns.factoryMethod.ex2.buttons;

public class WindowButton implements Button {

    @Override
    public void render() {
        System.out.println("rendering a window button");
    }

    @Override
    public void onClick() {
        System.out.println("button of window was clicked");
    }

}
