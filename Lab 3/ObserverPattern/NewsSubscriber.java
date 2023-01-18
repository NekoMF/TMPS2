package ObserverPattern;
//concret observer

public class NewsSubscriber implements  Subscriber{

    private String news;


    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    @Override
    public void setNews(String news) {

    }
}

