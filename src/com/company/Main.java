package com.company;

public class Main {

    public static void main(String[] args) {
        SubscriberInterface subscriber = new ConsoleDisplay();

        WeatherData weatherData = new WeatherData();
        SubjectInterface subject = weatherData;

        subject.subscribe(subscriber);
        subject.notification();
    }
}
