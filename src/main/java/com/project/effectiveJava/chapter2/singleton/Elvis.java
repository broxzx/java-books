package com.project.effectiveJava.chapter2.singleton;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

}
