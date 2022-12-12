package abstractfactory;

abstract class Mobile
{
    private MobileType model = null;
    private Location location = null;

    Mobile(MobileType model, Location location)
    {
        this.model = model;
        this.location = location;
    }

    abstract void construct();


    MobileType getModel()
    {
        return model;
    }

    void setModel(MobileType model)
    {
        this.model = model;
    }

    Location getLocation()
    {
        return location;
    }

    void setLocation(Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Mobil model - "+model + " located in "+location;
    }
}


