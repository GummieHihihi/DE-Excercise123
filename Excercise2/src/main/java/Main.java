public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(1.5f),
                new Rectangle(2,3),
                new Square(4)
        };

        for (Shape shape:shapes) {
            System.out.println(shape.toString());
        }

    }
}
