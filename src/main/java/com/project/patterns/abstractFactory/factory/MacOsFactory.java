package com.project.patterns.abstractFactory.factory;

import com.project.patterns.abstractFactory.buttons.Button;
import com.project.patterns.abstractFactory.buttons.MacOsButton;
import com.project.patterns.abstractFactory.checkbox.Checkbox;
import com.project.patterns.abstractFactory.checkbox.MacOsCheckbox;

public class MacOsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
