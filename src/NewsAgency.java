/*
Represents the central hub for publishing news.
It maintains a list of subscribers and notifies them whenever new news is available.
 */

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String agency;
    private List<Observer> observers = new ArrayList<>(); // can handle growing number of subscribers

    public NewsAgency(String agency){
        this.agency = agency.toUpperCase();
    }

    @Override
    public void subscribe(Observer observer) { // users should be able to subscribe to the news service
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(News news) { // notifies when news is published
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void publish(News news) {
        System.out.println("\n[" + agency + "] Publishing: " + news.getTitle());
        notifyObservers(news);
    }
}