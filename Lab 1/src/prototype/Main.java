package prototype;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle(10);

        Rectangle rectangle1 = new Rectangle(5,5);

        List<Shape> shapeList= new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(rectangle1);

        List<Shape> shapeListClone = new ArrayList<>();

        for (Shape shape:shapeList){
            Shape clone = shape.clone();
            shapeListClone.add(clone);

            if (shape!=clone){
                System.out.println("Obiectul din lista originala si cea clonata este diferit, dar cu proprietati egale");
                System.out.println("Original: "+shape);
                System.out.println("Clonat: "+ clone);
                System.out.println("*************************");

            }
        }
    }
}
