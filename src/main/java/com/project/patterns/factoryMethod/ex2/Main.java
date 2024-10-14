package com.project.patterns.factoryMethod.ex2;

import com.project.patterns.factoryMethod.ex2.factory.Dialog;
import com.project.patterns.factoryMethod.ex2.factory.HtmlDialog;
import com.project.patterns.factoryMethod.ex2.factory.WindowDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String... args) {
        configure();
        runBusinessLogic();

    }

    static void configure() {
        if (System.getProperties().get("os.name").equals("Linux")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
