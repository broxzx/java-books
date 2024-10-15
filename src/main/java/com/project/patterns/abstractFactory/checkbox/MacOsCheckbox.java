package com.project.patterns.abstractFactory.checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("MacOs checkbox was clicked");

    }
}
