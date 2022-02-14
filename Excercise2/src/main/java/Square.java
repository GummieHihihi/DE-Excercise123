/**
 * this class extend shape, it's the square
 * @side: the side  the square
 */
public class Square extends Shape implements ShapeCharacteristic {
    private float side;

    public Square(float side){
        super();
        this.side = side;
    }

    public float getArea(){
        return side*side;
    }

    public float getPerimeter(){
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
