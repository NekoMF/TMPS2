package abstractfactory;

class Samsung extends Mobile {
    Samsung(Location location) {
        super(MobileType.samsung, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Use a samsung model of phone constructed in "+getLocation());
    }
}
