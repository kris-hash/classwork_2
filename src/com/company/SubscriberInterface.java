package com.company;

public interface SubscriberInterface { // интерфейс наблюдателя
    void setData(float temperature, float humidity, float pressure); //метож для получения данных
    void update(); //метод, который будет обновлять данные
}
