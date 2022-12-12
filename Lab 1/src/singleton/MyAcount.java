package singleton;


public class MyAcount {
    
    private static MyAcount instantiereCont;
    private double sum;
    private long cod;

    private MyAcount(){
      cod= Math.round(Math.random()*10000);

    }

    public double getSum() {
        return sum;
    }

    public void addOrSubstarctMoney(double add){
        this.sum+=add;
    }
    public static MyAcount getInstance() {
        if (instantiereCont == null) {
            instantiereCont= new MyAcount();

        }
        return instantiereCont;
    }


    public static void setInstantiereCont(MyAcount instantiereCont){
        MyAcount.instantiereCont= instantiereCont;
    }


    public long getCod() {
        return this.cod;
    }
}


