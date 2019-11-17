package Test.model;

import com.tradeshift.model.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle1;
    private  Triangle triangle2;
    private  Triangle triangle3;
    private  Triangle triangle4;
    @BeforeEach
    void setUp() {
        this.triangle1 = new Triangle.Builder().setSide1(1.8).setSide2(2.4).setSide3(14.99).build();
        this.triangle2 = new Triangle.Builder().setSide1(6.0).setSide2(6.0).setSide3(6.0).build();
        this.triangle3 = new Triangle.Builder().setSide1(6.0).setSide2(6.0).setSide3(9.0).build();
        this.triangle4 = new Triangle.Builder().setSide1(6.0).setSide2(3.0).setSide3(4.0).build();
    }

    @Test
    void isTriangle() throws Exception {
        assertTrue(triangle2.isTriangle());
        assertTrue(triangle3.isTriangle());
        assertTrue(triangle4.isTriangle());
        assertThrows(Exception.class, () -> {
            triangle1.isTriangle();
        });    }

    @Test
    void getTypeofTriangle() {
        assertEquals(triangle2.getTypeofTriangle(), "EQUILATERAL");
        assertEquals(triangle3.getTypeofTriangle(), "ISOSCELES");
        assertEquals(triangle4.getTypeofTriangle(), "SCALENE");
    }
}