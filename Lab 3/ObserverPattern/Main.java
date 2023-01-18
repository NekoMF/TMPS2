package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        BlogList observable = new  BlogList();
        NewsSubscriber observer = new NewsSubscriber();
        observable.addObserver(observer);
        observable.setNews("Check out my new history on my blog");
        System.out.println(observable.getNews());
        System.out.println(observable.getNews());
        observable.removeObserver(observer);
        System.out.println(observable.getNews());

    }
}

