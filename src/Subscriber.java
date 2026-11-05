/*
Represents users or entities subscribed to the news service.
Subscribers receive immediate notifications about any breaking news published by the agency.
 */

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private List<String> categories = new ArrayList<>();
    private boolean filtering = false;

    public Subscriber(String name) {
        this.name = name;
    }

    public void addCategory(String category) { // for personalized subscriptions or categorization of news updates
        filtering = true;
        if (!categories.contains(category)) {
            categories.add(category);
        }
    }

    public void removeCategory(String category) {
        categories.remove(category);
    }

    @Override
    public void update(News news) {
        if (!filtering || categories.contains(news.getCategory())) {
            System.out.println(name + " received [" + news.getCategory() + "]: " + news.getTitle());
        }
    }
}