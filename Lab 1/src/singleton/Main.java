package singleton;

public class Main {
    public static void main(String[] args) {
        MyAcount contBancar1 = MyAcount.getInstance();
        MyAcount contBancar2 = MyAcount.getInstance();

        System.out.println("Suma initiala in cont bancar1");
        System.out.println(contBancar1.getSum());
        System.out.println("Suma initiala in cont bancar2");
        System.out.println(contBancar2.getSum());

        contBancar1.addOrSubstarctMoney(10500);

        System.out.println("Suma dupa operatie in cont bancar1");
        System.out.println(contBancar1.getSum());
        System.out.println("Suma dupa operatie in cont bancar2");
        System.out.println(contBancar2.getSum());

        if (contBancar1.getCod() == contBancar2.getCod()) {
            System.out.println("Acesta este un exemplu de Singleton ");
        } else {
            System.out.println("Eroare!");
        }
    }

}