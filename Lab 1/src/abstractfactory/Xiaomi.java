package abstractfactory;

class Xiaomi extends Mobile {
    Xiaomi(Location location) {
        super(MobileType.xiaomi, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Use a xiaomi model of phone constructed in "+getLocation());
    }
}
