package com.project.patterns.factoryMethod.ex2.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("rendering a html button");
    }

    @Override
    public void onClick() {
        System.out.println("html button was clicked");
    }

}
