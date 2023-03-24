package org.fasulino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals( 10.800000190734863, Calculator.add(10, 0.8F));
        assertEquals( 10.8F, Calculator.add(10, 0.8F));
        assertEquals( 0.000000000002F, Calculator.add(0.000000000001F, 0.000000000001F));
    }

    @Test
    void subtract() {
        assertEquals( 9.199999809265137, Calculator.subtract(10, 0.8F));
        assertEquals( 9.2F, Calculator.subtract(10, 0.8F));
        assertEquals( 0, Calculator.subtract(0.00000000001F, 0.00000000001F));
    }

    @Test
    void divide() {
        assertEquals( 155.5, 217.7 / 1.4);
        assertTrue(Float.isInfinite(Calculator.divide(10,0)));
    }

    @Test
    void multiply() {
        assertEquals( 9.199999809265137, Calculator.multiply(4.6F,2));
        assertEquals( 9.2F, Calculator.multiply(4.6F,2));
        assertEquals( 0, Calculator.multiply(4.6F,0));
    }
}