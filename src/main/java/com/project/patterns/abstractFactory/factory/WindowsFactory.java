package com.project.patterns.abstractFactory.factory;

import com.project.patterns.abstractFactory.buttons.Button;
import com.project.patterns.abstractFactory.buttons.WindowsButton;
import com.project.patterns.abstractFactory.checkbox.Checkbox;
import com.project.patterns.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
