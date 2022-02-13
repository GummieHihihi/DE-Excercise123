public class Square extends Shape{
    private int side;

    public Square(int side){
        super();
        this.side = side;
    }

    public int getArea(){
        return side*side;
    }

    public int getPerimeter(){
        return perimeter = side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
