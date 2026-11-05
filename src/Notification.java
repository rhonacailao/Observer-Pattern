/*
Subscribers shouldn't directly request news updates but should be
notified by the news agency when new information is available.
 */

public class Notification implements Observer {
    @Override
    public void update(News news) {
        System.out.println("Notification: BREAKING - " + news.getTitle());
    }
}