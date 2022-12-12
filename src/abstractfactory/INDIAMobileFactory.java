package abstractfactory;

class INDIAMobileFactory implements MobileFactory{
    public Mobile buildMobile(MobileType model) {
        Mobile mobile = null;
        switch (model) {
            case samsung:
                mobile = new Samsung(Location.INDIA);
                break;

            case xiaomi:
                mobile = new Xiaomi(Location.INDIA);
                break;

            case nokia:
                mobile = new Nokia(Location.INDIA);
                break;

            default:
                break;

        }
        return mobile;
    }
}
