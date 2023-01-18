package MementoPattern;

public class Main {

    public static void main(String[] args)
    {
        Referat referat = new Referat(1, "Referatul meu") ;
        referat.setContent("ABC");
        System.out.println(referat);

        ReferatMemento memento = referat.createMemento(); //created immutable memento

        referat.setContent("123");    //schimbam contentul
        System.out.println(referat);

        referat.restore(memento);
        System.out.println(referat);  //original content
    }
}

