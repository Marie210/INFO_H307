package sample;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiguresTests {

    @Test
    public void circle_area() {
        Figures circle = new Figures();
        circle.radius = 3;
        circle.circle_area();
        double a = Math.PI * 9;
        assertEquals(a,circle.circle_area());
    }
}
