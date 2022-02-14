import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private Square square;
    @Before
    public void setUp(){
        square = new Square(4);
    }

    @Test
    public void getArea() {
        assertEquals(square.getArea(), 16, 0);
        System.out.println(" test square area successfully");
    }

    @Test
    public void getPerimeter() {
        assertEquals(square.getPerimeter(), 20, 0);
        System.out.println("test square perimeter successfully");
    }
}