package prototype;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public Circle clone() {
        return new Circle(this.radius);
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", type=" + getType() +
                '}';
    }
}
