package MementoPattern;

public class Referat {
    private long id;
    private String title;
    private String content;

    public Referat(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }


    public ReferatMemento createMemento() {
        ReferatMemento m = new ReferatMemento(id, title, content);
        return m;
    }

    public void restore(ReferatMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();

    }

    @Override
    public String toString() {
        return "Referat [id=" + id + ", title=" + title + ", content=" + content + "]";
    }

    public void setContent(String content) {
        this.content = content;
    }
}
