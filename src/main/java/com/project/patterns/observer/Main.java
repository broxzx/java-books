package com.project.patterns.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        FirstConsumer firstConsumer = new FirstConsumer();
        SecondConsumer secondConsumer = new SecondConsumer();
        ThirdConsumer thirdConsumer = new ThirdConsumer();

        weatherData.addConsumer(firstConsumer);
        weatherData.addConsumer(secondConsumer);
        weatherData.addConsumer(thirdConsumer);

        weatherData.notifyConsumers();
        weatherData.removeConsumer(firstConsumer);

        System.out.println("-".repeat(50));
        weatherData.notifyConsumers();
    }

}
