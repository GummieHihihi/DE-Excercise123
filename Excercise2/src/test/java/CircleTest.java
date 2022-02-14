/**
 * testing class of the Circle class
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle circle;
    @Before
    public void setUp(){
        circle = new Circle(4);
    }

    @Test
    public void getArea() {
        assertEquals(circle.getArea(), 25.12, 0.1);
        System.out.println("test get area sucessfully");
    }

    @Test
    public void getPerimeter() {
        assertEquals(circle.getPerimeter(), 50.24, 0.1);
        System.out.println("test calculate parameter successfully");
    }
}