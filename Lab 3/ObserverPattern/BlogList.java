package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//subject
public class BlogList {

    private String news;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addObserver(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeObserver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void setNews(String news) {
        this.news = news;
        for (Subscriber subscriber : this.subscribers) {
            subscriber.update(this.news);
        }
    }

    public List<Subscriber> getNews() {
        return subscribers;
    }
}

