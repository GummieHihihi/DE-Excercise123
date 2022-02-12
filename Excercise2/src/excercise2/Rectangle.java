package excercise2;

public class Rectangle extends Shape{
    private int longside;
    private int shortside;
    public Rectangle(int longside, int shortside){
        super();
        this.longside = longside;
        this.shortside = shortside;
    }
    public int getPerimeter(){
        return perimeter = (longside + shortside) * 2;
    }

    public int getArea(){
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
