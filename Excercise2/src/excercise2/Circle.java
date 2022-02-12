package excercise2;

class Circle extends Shape{
    private int radius;
    private final float pi = (float) 3.14;
    public Circle(int radius){
        this.radius = radius;
    }

    public int getArea(){
        this.perimeter = (int) (2 * pi * radius);
        return this.perimeter;
    }
    public int getPerimeter(){
        this.area = (int) (pi * radius * radius);
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
