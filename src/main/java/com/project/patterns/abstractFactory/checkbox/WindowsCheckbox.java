package com.project.patterns.abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("windows checkbox was clicked");
    }
}
