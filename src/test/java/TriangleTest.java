import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testThatValidTriangleAreValid() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isValid());
    }
}
