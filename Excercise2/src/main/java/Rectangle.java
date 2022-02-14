/**
 * This class is the rectangle, it inherit the Shape class
 * @longside : the long side of the rectangle
 * @shortside: the short side of the rectangle
 */

public class Rectangle extends Shape implements ShapeCharacteristic {
    private float longside;
    private float shortside;

    public Rectangle(float longside, float shortside){
        this.longside = longside;
        this.shortside = shortside;
    }
    public float getPerimeter(){
        return perimeter = (longside + shortside) * 2;
    }

    public float getArea(){
        return area = longside * shortside;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
