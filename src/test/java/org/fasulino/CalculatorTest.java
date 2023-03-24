package org.fasulino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals( 10.800000190734863, Calculator.add(10, 0.8F));
    }

    @Test
    void subtract() {
        assertEquals( 9.199999809265137, Calculator.subtract(10, 0.8F));
    }

    @Test
    void divide() {
        assertEquals( 2, 2.8 / 1.4);
        assertTrue(Float.isInfinite(Calculator.divide(10,0)));
    }

    @Test
    void multiply() {
        assertEquals( 9.199999809265137, Calculator.multiply(4.6F,2));
        assertEquals( 0, Calculator.multiply(4.6F,0));
    }
}