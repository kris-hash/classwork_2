package com.company;

public interface SubjectInterface {// интерфейс, позваляющий быть наблюдаемым объектом etc помогает стать наблюда
    void subscribe(SubscriberInterface subscriberInterface); // метод чтобы кто=то мог подписаться
    void deleteSubscriber(SubscriberInterface subscriberInterface); // метод для удаления подписчика
    void notification();
}
