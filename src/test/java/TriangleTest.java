import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testThatValidTrianglesAreValid() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isValid());
    }

    @Test
    public void testThatInvalidTrianglesAreInvalid() {
        Triangle triangle = new Triangle(3, 4, 10);
        assertFalse(triangle.isValid());
    }
}
