package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConsoleDisplay implements SubscriberInterface{

    private float temperature;
    private float humidity;
    private float pressure;

    public ConsoleDisplay (){

        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }

    @Override
    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void printData(){
        System.out.printf("temperature: %f, humidity: %f, pressure: %f", temperature, humidity, pressure);
    }

    @Override
    public void update() {
        printData();
    }
}
