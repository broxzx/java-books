package com.project.patterns.abstractFactory.app;

import com.project.patterns.abstractFactory.buttons.Button;
import com.project.patterns.abstractFactory.checkbox.Checkbox;
import com.project.patterns.abstractFactory.factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.onClick();
        checkbox.check();
    }

}
