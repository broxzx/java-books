package com.project.patterns.observer;

import com.project.patterns.observer.consumers.FirstConsumer;
import com.project.patterns.observer.consumers.SecondConsumer;
import com.project.patterns.observer.consumers.ThirdConsumer;
import com.project.patterns.observer.weather.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        FirstConsumer firstConsumer = new FirstConsumer();
        SecondConsumer secondConsumer = new SecondConsumer();
        ThirdConsumer thirdConsumer = new ThirdConsumer();

        System.out.println("-".repeat(50));
        weatherData.addConsumer(firstConsumer);
        weatherData.addConsumer(secondConsumer);
        weatherData.addConsumer(thirdConsumer);
        weatherData.notifyConsumers();

        System.out.println("-".repeat(50));
        weatherData.notifyConsumers();
        weatherData.removeConsumer(firstConsumer);

        System.out.println("-".repeat(50));
        weatherData.notifyConsumers();
    }

}
