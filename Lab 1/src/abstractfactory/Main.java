package abstractfactory;

class Main {
    public static void main(String[] args) {
        Mobile mobile1 = null;
        Mobile mobile2 = null;

        mobile1= new USAMobileFactory().buildMobile(MobileType.xiaomi);
        mobile2= new INDIAMobileFactory().buildMobile(MobileType.samsung);


    }
}
