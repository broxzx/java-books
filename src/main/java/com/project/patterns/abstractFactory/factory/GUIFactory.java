package com.project.patterns.abstractFactory.factory;

import com.project.patterns.abstractFactory.buttons.Button;
import com.project.patterns.abstractFactory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
