import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rec;
    @Before
    public void setUp(){
        rec = new Rectangle(5, 3);
    }

    @Test
    public void getPerimeter() {
        assertEquals(rec.getPerimeter(), 16, 0.1);
        System.out.println("test get perimeter sucessfully");
    }

    @Test
    public void getArea() {
        assertEquals(rec.getArea(), 15, 0.1);
        System.out.println("test get area sucessfully");
    }
}