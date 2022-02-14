/**
 * this class extend the Shape object and has shape characteristic like area and perimeter
 * @radius : The radius side of the Circle
 */
class Circle extends Shape implements ShapeCharacteristic {
    private float radius;
    private final float pi = (float) 3.14;

    public Circle(float radius){
        this.radius = radius;
    }

    public float getArea(){
        this.perimeter = (float) (2 * pi * radius);
        return this.perimeter;
    }
    public float getPerimeter(){
        this.area = (float) (pi * radius * radius);
        return this.area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
