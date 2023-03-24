package org.fasulino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals( 10.8, 10 + 0.8);
    }

    @Test
    void subtract() {
        assertEquals( 9.2, 10 - 0.8);
    }

    @Test
    void divide() {
        assertEquals( 2, 2.8 / 1.4);
    }

    @Test
    void multiply() {
        assertEquals( 9.2, 4.6 * 2);
    }
}