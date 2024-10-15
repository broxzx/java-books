package com.project.patterns.abstractFactory;

import com.project.patterns.abstractFactory.app.Application;
import com.project.patterns.abstractFactory.factory.GUIFactory;
import com.project.patterns.abstractFactory.factory.MacOsFactory;
import com.project.patterns.abstractFactory.factory.WindowsFactory;

public class Main {

    private static Application configure() {
        Application application;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("linux")) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacOsFactory();
        }

        application = new Application(guiFactory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configure();
        application.paint();
    }

}
