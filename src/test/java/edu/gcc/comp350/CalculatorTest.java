package edu.gcc.comp350;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        //Fail Test
        Calculator c = new Calculator();
        assertEquals(9, c.add(4, 5));
    }
}