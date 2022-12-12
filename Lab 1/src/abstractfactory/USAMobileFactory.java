package abstractfactory;

class USAMobileFactory implements MobileFactory{
    public  Mobile buildMobile(MobileType model) {
        Mobile mobile = null;
        switch (model) {
            case samsung:
                mobile = new Samsung(Location.USA);
                break;

            case xiaomi:
                mobile = new Xiaomi(Location.USA);
                break;

            case nokia:
                mobile = new Nokia(Location.USA);
                break;

            default:
                break;

        }
        return mobile;
    }
}
