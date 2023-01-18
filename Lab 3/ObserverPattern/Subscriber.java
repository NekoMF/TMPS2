package ObserverPattern;
//observer

public interface Subscriber {

    public void update(Object a);

    void setNews(String news);
}
