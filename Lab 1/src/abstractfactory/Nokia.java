package abstractfactory;

class Nokia extends Mobile {
    Nokia(Location location) {
        super(MobileType.nokia, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Use a nokia model of phone constructed in "+getLocation());
    }
}
