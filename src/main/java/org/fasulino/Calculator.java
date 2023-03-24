package org.fasulino;

import java.math.BigDecimal;

public interface Calculator {
    static float add(float x, float y){
        return x + y;
    }

    static float subtract(float x, float y){
        return x - y;
    }

    static float divide(float x, float y){
        return x / y;
    }

    static float multiply(float x, float y){
        return x * y;
    }
}