package com.project.patterns.factoryMethod.ex2.factory;

import com.project.patterns.factoryMethod.ex2.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();

}
