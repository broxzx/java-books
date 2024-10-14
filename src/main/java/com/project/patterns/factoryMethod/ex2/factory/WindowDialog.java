package com.project.patterns.factoryMethod.ex2.factory;

import com.project.patterns.factoryMethod.ex2.buttons.Button;
import com.project.patterns.factoryMethod.ex2.buttons.WindowButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

}
