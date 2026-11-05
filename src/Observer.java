/*
Ensure that the communication between the news agency and subscribers is decoupled.
 */


interface Observer {
    void update(News news);
}