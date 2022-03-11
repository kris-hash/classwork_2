package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SubjectInterface {// в классе реализуем интерфейс

    private float temperature; // создали приватные поля для хранения данных
    private float humidity;
    private float pressure;
    private List<SubscriberInterface> subscriberlist; // список подписчиков

    // создаем конструктор
    public WeatherData (){
        //инициализируем поля (создаем и добавляемм в память)
        this.subscriberlist = new ArrayList<>();
        this.temperature = 23.33f;
        this.humidity = 33.2f;
        this.pressure = 4.4f;
    }
    // был абстрактный метод, а сейчас нужно его реализовать
    @Override
    public void subscribe(SubscriberInterface subscriberInterface) {
         subscriberlist.add(subscriberInterface);
    }

    @Override
    public void deleteSubscriber(SubscriberInterface subscriberInterface) { // тип данных и его имя
        subscriberlist.remove(subscriberInterface);
    }

    @Override
    public void notification() {
        for(SubscriberInterface subscriber : subscriberlist) { //пробегается по списку
            subscriber.setData(this.temperature, this.humidity, this.pressure);
            subscriber.update();

        }
//        for(int i = 0; i < subscriberlist.size(); i++){
//            subscriberlist.get(i).setData(this.temperature, this.humidity, this.pressure); //get спрашивает у листа элемент с номером  i
//        }
    }
}
