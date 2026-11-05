/*
Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.
 */


interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(News news);
}